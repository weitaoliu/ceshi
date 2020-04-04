package cn.socket.udp.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender implements Runnable{
	
	private DatagramSocket ds;
	
	Sender(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
			
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in)) ;
			String str = "";
			
			while((str = bufr.readLine()) != null) {

				byte[] buf = str.getBytes();
				DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.151.4.144"), 10005);
				ds.send(dp);//×èÈûÊ½µÄ

				if(str.equals("886"))
					break;
			}
			
			ds.close();	
		} catch(Exception e) {
			
		}
		
		
	}
 
}
