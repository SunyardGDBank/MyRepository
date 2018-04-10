package com.sunyard.socket;

import com.sunyard.helper.ReportUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class BasicCipherSocket {
	
	private String host;
	private int port;
	
	
	public BasicCipherSocket(String host, int port) {
		super();
		this.host = host;
		this.port = port;
	}

	public String execute(String timeStamp,String merchantNo,String tradeContext){
		
		Socket socket = null;
		OutputStream out = null;
		InputStream in = null;
		ByteArrayOutputStream stream = null;
		try {
			socket = new Socket(host, port);
			out = socket.getOutputStream();
			
			byte [] b_version =  "1.0".getBytes();
			byte [] b_merchantNo = merchantNo.getBytes();
			byte [] b_timeStamp = timeStamp.getBytes();
			byte [] b_tradeContext = tradeContext.getBytes();
			byte [] b_tradeLength = ReportUtil.int2byte(b_tradeContext.length, 8);
			
			int totalLength = b_version.length+b_merchantNo.length+b_timeStamp.length+b_tradeLength.length+b_tradeContext.length;
			byte [] b_totalLength = ReportUtil.int2byte(totalLength,8);
			stream = new ByteArrayOutputStream(totalLength);
			
			stream.write(b_totalLength);
			stream.write(b_version);
			stream.write(b_merchantNo);
			stream.write(b_timeStamp);
			stream.write(b_tradeLength);
			stream.write(b_tradeContext);
			System.out.println("Trade发送报文:"+new String(stream.toByteArray()));
			out.write(stream.toByteArray());
			out.flush();
			socket.shutdownOutput();

			in = socket.getInputStream();
			b_totalLength = new byte[8];
			in.read(b_totalLength);
			totalLength = ReportUtil.byte2int(b_totalLength);
			byte [] b_returnCode = new byte[2];
			in.read(b_returnCode);

			String returnCode = new String(b_returnCode);
			System.out.println("Trade:报文总长度:"+totalLength+":返回码:"+returnCode);
			
			if("00".equals(returnCode)){
				int respContextLength = totalLength-b_returnCode.length;
				byte [] b_respContext = new byte[respContextLength];

				int readLength = 0,off = 0,left = totalLength;
				int tempLength = 1024;
				byte [] tempByte = new byte[tempLength];
				while(left>0){
					int realLength = Math.min(tempLength, left);
					readLength = in.read(tempByte,0,realLength);
					if(readLength==-1){
						break;
					}
					System.arraycopy(tempByte, 0, b_respContext, off, readLength);
					off+=readLength;
					left-=readLength;
				}
				
				return new String(b_respContext);
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
		return null;
	}
}
