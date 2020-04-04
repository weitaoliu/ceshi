package cn.socket.udp.demo;

import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpEntryDemo {

	public static void main(String[] args) throws SocketException {
		
		DatagramSocket send = new DatagramSocket();
		DatagramSocket receive = new DatagramSocket(10005);
		
		Sender sendIns = new Sender(send);
		Receiver receiveIns = new Receiver(receive);
		
		new Thread(sendIns).start();
		new Thread(receiveIns).start();
	}

}
