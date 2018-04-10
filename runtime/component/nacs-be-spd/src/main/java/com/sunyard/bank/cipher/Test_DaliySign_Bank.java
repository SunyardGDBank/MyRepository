package com.sunyard.bank.cipher;

import com.sunyard.helper.CipherHelper;
import com.sunyard.helper.ReportUtil;
import org.apache.commons.codec.binary.Base64;
import org.moqui.context.ExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;


//本行签到

public class Test_DaliySign_Bank {
	private static final Logger logger = LoggerFactory.getLogger(Test_DaliySign_Bank.class);
	//证书配置

	private String keyPath="E:\\nacs\\runtime\\component\\nacs-be-spd\\src\\main\\resource\\crossbank\\spdb_Test_Private.keystore";
	private String keyPawd ="spdb_Test_Key";
	private String keyAlias= "spdb_Test_Key";
	private String host = "10.12.71.250";
	private Integer port = 8080;
	public  Map<String, Object> getSign(ExecutionContext ec){

		logger.info("文签到开始成功11");
		Map<String, Object> result = new HashMap<String, Object>();

		DaliySocket socket = new DaliySocket(host,port);

		logger.info("222");
		//商户号
		socket.execute("9900000337");
		logger.info("333");
		String timeTamp = socket.getTampTime();
		String keyValue = socket.getKeyValue();
		logger.info("秘钥："+keyValue+" 时间戳： "+timeTamp);
		//Base64
		byte [] b_keyValue = Base64.decodeBase64(keyValue);
		logger.info("4444");
		try{
			//私钥解密，获取秘钥
			PrivateKey privateKey = CipherHelper.getPrivateKey(keyPath,keyPawd,keyAlias,"PKCS12");
			logger.info("5555");
			Cipher cipher = Cipher.getInstance(privateKey.getAlgorithm());
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			b_keyValue = cipher.doFinal(b_keyValue);
		}catch (Exception e) {
			e.printStackTrace();
		}

		keyValue = Base64.encodeBase64String(b_keyValue);
		logger.info("签到结束问问额");
		return result;

	}

//	public static Map<String,Object> excute(ExecutionContext ec){
//
//	}


	class DaliySocket{

		private String host;
		private int port;
		public DaliySocket(String host, int port) {
			super();
			this.host = host;
			this.port = port;
		}
		private String tampTime;
		private String keyValue;
		public String getTampTime() {
			return tampTime;
		}

		public String getKeyValue() {
			return keyValue;
		}

		public void execute(String merchantNo){
			Socket socket = null;
			OutputStream out = null;
			InputStream in = null;
			ByteArrayOutputStream stream = null;
			try {
				socket = new Socket(host, port);
				logger.info("execute1");
				out = socket.getOutputStream();

				byte [] b_tradeType = "A".getBytes();
				byte [] b_version =  "1.0".getBytes();
				byte [] b_merchantNo = merchantNo.getBytes();

				int totalLength = b_tradeType.length+b_version.length+b_merchantNo.length;
				logger.info("总长度："+totalLength);
				byte [] b_totalLength = ReportUtil.int2byte(totalLength,8);
				stream = new ByteArrayOutputStream(totalLength);

				stream.write(b_totalLength);
				stream.write(b_tradeType);
				stream.write(b_version);
				stream.write(b_merchantNo);
				out.write(stream.toByteArray());
				out.flush();
				socket.shutdownOutput();

				in = socket.getInputStream();
				//报文长度
				b_totalLength = new byte[8];
				in.read(b_totalLength);
				totalLength = ReportUtil.byte2int(b_totalLength);
				//返回码
				byte [] b_returnCode = new byte[2];
				in.read(b_returnCode);
				logger.info("返回码："+b_returnCode);
				byte [] b_timeStamp = new byte[13];
				in.read(b_timeStamp);
				if("00".equals(new String(b_returnCode))){
					int keyLength = totalLength-(b_returnCode.length+b_timeStamp.length);
					byte [] b_keyCipheValue = new byte[keyLength];
					in.read(b_keyCipheValue);
					this.tampTime = new String(b_timeStamp);
					this.keyValue =new String(b_keyCipheValue);

				}else{
					logger.info("Key:报文总长度:"+totalLength+":返回码:"+new String(b_returnCode));

				}
				socket.shutdownInput();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
					try {
						if(out!=null){
							out.close();
						}
						if(in!=null){
							in.close();
						}
						if(socket!=null){
							socket.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
	}
	
}
