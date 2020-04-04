package cn.socket.tcp.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		
		/**
		 * 	建立tcp服务端的思路：
		 * 	1，创建服务的socket服务，通过ServerSocket对象
		 * 	2，服务端必须对外提供一个端口，否则客户端无法连接。
		 * 	3，获取连接过来的客户端对象。
		 * 	4，通过客户端对象获取socket流，读取客户端发来的数据，并打印在控制台上
		 * 	5，关闭资源。关闭客户端，关闭服务端。
		 */
		
		//创建服务端对象
		ServerSocket ss = new ServerSocket(10001);
		
		//获取连接过来的客户端对象 
		Socket s = ss.accept();
		
		//通过socket对象获取输入流，要读取客户端发来的数据。 
		InputStream in = s.getInputStream();
 
		String ip = ss.getInetAddress().getHostAddress();
		byte[] buf = new byte[1024];
		
		int len = in.read(buf); 
		String text = new String(buf,0,len);
		System.out.print(ip + "：" + text);
		 
		s.close(); 
		ss.close();
		 
	}

}
