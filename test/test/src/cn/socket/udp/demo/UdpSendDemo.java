package cn.socket.udp.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpSendDemo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("���Ͷ�����-----------------");
		
		/**
		 * 	����UDP����ķ��Ͷ�
		 * 	˼·��
		 * 		1������udp��socket����
		 * 		2����Ҫ���͵����ݷ�װ�����ݰ���
		 * 		3��ͨ��udp��socket�������ݰ����ͳ�ȥ
		 * 		4���ر�socket����
		 */
		
		//1��udpsocket����ʹ��DatagramSocket����
		DatagramSocket ds = new DatagramSocket();
		
		//2����Ҫ���͵����ݷ�װ�����ݰ��С�
		String str = "udp������ʾ���������ˣ�";
		
		byte[] buf = str.getBytes();
		//ʹ��DatagramPacket�����ݷ�װ���ö������
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.151.4.144"), 10000);
		//3��ͨ��udp��socket�������ݰ����ͳ�ȥ��ʹ��send������
		ds.send(dp);
		//4���ر���Դ
		ds.close();
	}

}
