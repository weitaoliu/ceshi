package cn.otherapi.demo;

import java.io.IOException;

public class RuntimeDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		 * 	Runtime��û�й��췽��ժҪ��˵�����಻���Դ�������
		 * 	�ַ��ֻ��зǾ�̬������˵������Ӧ���ṩ��̬�ķ��ظ������ķ�����
		 * 	����ֻ��һ����˵��Runtime��ʹ���˵������ģʽ��
		 */
		
		Runtime r = Runtime.getRuntime();
		
		Process p = r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		Thread.sleep(5000);
		p.destroy();
	}

}
