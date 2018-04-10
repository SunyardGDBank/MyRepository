package com.sunyard.bank.cipher;

import com.sunyard.helper.CipherHelper;
import com.sunyard.socket.BasicCipherSocket;
import org.apache.commons.codec.binary.Base64;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;


public class Test_SinQuery_Bank {
	
	private String timeStamp = "0000020170412";
	private String keyValue = "D73CKOk+rVg7uUnkXiRxYA==";

	public String initContext(){
		
		Document tempDoc = DocumentHelper.createDocument();
		Element root = tempDoc.addElement("STP");
		Element head = root.addElement("HEAD");
		
		head.addElement("TRNCODE").setText("QRYRST");
		head.addElement("VERSION").setText("3.0");
		head.addElement("DSFSN").setText("15011600703230664");
		head.addElement("DSFDATE").setText("20150206");
		head.addElement("DSFTIME").setText("061244");
		head.addElement("DSFNO").setText("9900000337");
		head.addElement("DSFNAME").setText("平安付");
		
		Element body = root.addElement("BODY");
		
		body.addElement("DSFSN").setText("15011600703230664");

		
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
		String tradeContext = this.initContext();

		BasicCipherSocket socket = new BasicCipherSocket("10.112.14.219",4000);
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
