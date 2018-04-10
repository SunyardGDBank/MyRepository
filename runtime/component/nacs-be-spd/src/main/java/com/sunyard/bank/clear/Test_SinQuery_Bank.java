package com.sunyard.bank.clear;

import com.sunyard.socket.BasicSocket;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;


public class Test_SinQuery_Bank {
	
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
		 return tempDoc.asXML();
	}
	
	@Test
	public void test1(){
		
		String tradeContext = this.initContext();
		BasicSocket socket = new BasicSocket("10.129.39.55", 3000);      
		String respContext = socket.execute(tradeContext);
		System.out.println("响应报文"+respContext);
	}
}
