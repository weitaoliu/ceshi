package cn.socket.tcp.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws IOException {

		/**
		 * 	Tcp���䣬�ͻ��˽����Ĺ��̡�
		 * 	1������tcp�ͻ��˵�socket����ʹ�õ���socket����
		 * 		����ö���һ��������ȷĿ�ĵأ�Ҫ���ӵ���������
		 * 	2��������ӽ����ɹ���˵�����ݴ���ͨ���ѽ�����
		 * 		��ͨ������socket�����ǵײ㽨���õġ���Ȼ������˵������������룬���������
		 * 		��Ҫ���������������󣬿�����Socket����ȡ��
		 * 		ͨ��getOutputStream()��getInputStream()����ȡ�����ֽ�����
		 * 	3��ʹ���������������д����
		 * 	4���ر���Դ��
		 */
		
		//�����ͻ���socket����
		Socket socket = new Socket("10.151.4.144", 10001);
		
		//��ȡsocket���е������
		OutputStream out = socket.getOutputStream();
		
		//ʹ���������ָ��������д��ȥ
		out.write("�ˣ�������".getBytes());
		
		//�ر���Դ
		socket.close();
	}

}
