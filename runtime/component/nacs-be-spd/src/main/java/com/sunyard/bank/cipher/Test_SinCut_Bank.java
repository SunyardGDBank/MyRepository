package com.sunyard.bank.cipher;

import com.sunyard.helper.CipherHelper;
import com.sunyard.socket.BasicCipherSocket;
import org.apache.commons.codec.binary.Base64;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Test_SinCut_Bank {
	private static final Logger logger = LoggerFactory.getLogger(Test_DaliySign_Bank.class);
	private String timeStamp = "0000020170412";
	private String keyValue = "D73CKOk+rVg7uUnkXiRxYA==";
	

	public String initContext(){
		
		Document tempDoc = DocumentHelper.createDocument();
		Element root = tempDoc.addElement("STP");
		Element head = root.addElement("HEAD");
		
		head.addElement("TRNCODE").setText("GATHER");
		head.addElement("VERSION").setText("3.0");
		head.addElement("DSFSN").setText("1501160070323066");
		
		SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyyMMdd:HHmmss");
		Date date = new Date();
		String _date =  dateFormat.format(date);
		String TransDate = _date.substring(0,8);
		String TransTime = _date.substring(9,15);
		
		head.addElement("DSFDATE").setText(TransDate);
		head.addElement("DSFTIME").setText(TransTime);
		head.addElement("DSFNO").setText("9900000337");
		head.addElement("DSFNAME").setText("平安付");
		
		Element body = root.addElement("BODY");
		
		body.addElement("ACCCODE").setText("6217934100006366");
		body.addElement("ACCNAME").setText("浦发1444235843");
		body.addElement("AMOUNT").setText("100");
		body.addElement("CCYID").setText("CNY");
		body.addElement("ACCTYPE").setText("0");
		body.addElement("IDTYPE").setText("7");
		body.addElement("IDCARD").setText("1444235843");
		body.addElement("BIZTYPE").setText("CAP01");
		body.addElement("MERNO").setText("800010000010021");
		body.addElement("MERNAME").setText("TEST1986");
		body.addElement("REMARK").setText("平安付");
		body.addElement("TELPHONE").setText("");
		body.addElement("RESERVED1").setText("");
		body.addElement("RESERVED2").setText("");
		
		String  tradeContext = tempDoc.asXML();
		
		byte [] b_keyValue = Base64.decodeBase64(keyValue);
		try {
			byte [] b_tradeContext = CipherHelper.encryCipherByAES(tradeContext.getBytes(), b_keyValue);
			return Base64.encodeBase64String(b_tradeContext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Test
	public void test1(){
		logger.info("开始连接服务器");
		String tradeContext = this.initContext();

		BasicCipherSocket socket = new BasicCipherSocket("10.129.39.55",5000);
		String respContext = socket.execute(timeStamp,"9900000337",tradeContext);

		byte[] b_respContext = Base64.decodeBase64(respContext);

		byte [] b_keyValue = Base64.decodeBase64(keyValue);
		try {
			b_respContext = CipherHelper.decryCipherByAES(b_respContext, b_keyValue);
			System.out.println(new String(b_respContext));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
