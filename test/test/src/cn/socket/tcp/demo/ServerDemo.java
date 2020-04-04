package cn.socket.tcp.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		
		/**
		 * 	����tcp����˵�˼·��
		 * 	1�����������socket����ͨ��ServerSocket����
		 * 	2������˱�������ṩһ���˿ڣ�����ͻ����޷����ӡ�
		 * 	3����ȡ���ӹ����Ŀͻ��˶���
		 * 	4��ͨ���ͻ��˶����ȡsocket������ȡ�ͻ��˷��������ݣ�����ӡ�ڿ���̨��
		 * 	5���ر���Դ���رտͻ��ˣ��رշ���ˡ�
		 */
		
		//��������˶���
		ServerSocket ss = new ServerSocket(10001);
		
		//��ȡ���ӹ����Ŀͻ��˶��� 
		Socket s = ss.accept();
		
		//ͨ��socket�����ȡ��������Ҫ��ȡ�ͻ��˷��������ݡ� 
		InputStream in = s.getInputStream();
 
		String ip = ss.getInetAddress().getHostAddress();
		byte[] buf = new byte[1024];
		
		int len = in.read(buf); 
		String text = new String(buf,0,len);
		System.out.print(ip + "��" + text);
		 
		s.close(); 
		ss.close();
		 
	}

}
