package com.sunyard.socket;

import com.sunyard.helper.ReportUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//import javassist.tools.framedump;

public class BasicSocket implements Runnable{
	
	private String host;
	private int port;
	
	
	public BasicSocket(String host, int port) {
		super();
		this.host = host;
		this.port = port;
	}

	public String execute(String tradeContext){
		
		Socket socket = null;
		OutputStream out = null;
		InputStream in = null;
		try {
			socket = new Socket(host, port);
			out = socket.getOutputStream();
			
			int totalLength = tradeContext.getBytes("GBK").length;
			String length=new Integer(totalLength).toString();
//			String length = "980";
			for(int i=length.length();i<8;i++){
					length="0"+length;
			}
			
			
			System.out.println("发送报文"+length+tradeContext);
			byte [] b_totalLength = ReportUtil.int2byte(totalLength, 8);
			
			out.write(b_totalLength);
			out.write(tradeContext.getBytes("GBK"));//UTF-8 会出现乱码
			out.flush();
			socket.shutdownOutput();

			in = socket.getInputStream();
			b_totalLength = new byte[8];
			 in.read(b_totalLength);

				
			totalLength = ReportUtil.byte2int(b_totalLength);
			System.out.println("报文总长度"+totalLength);
			byte [] b_respContext = new byte[totalLength];

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
			
			tradeContext = new String(b_respContext);
			socket.shutdownInput();
			
			System.out.println("报文总长度:"+totalLength+"返回报文:"+tradeContext);
			return tradeContext;
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(out!=null){
					out.close();
				}
				if(in!=null){
					in.close();
				}
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public void setTradeContext(String initBeiJ) {
		// TODO Auto-generated method stub
		this.tradeContext = initBeiJ;
		
	}
	private String tradeContext;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.execute(tradeContext);
	}
}
