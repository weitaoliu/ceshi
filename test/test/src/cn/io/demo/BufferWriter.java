package cn.io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("data.txt", true);
		
		//	Ϊ�����д���Ч�ʣ�ʹ�����ַ����Ļ�������
		//	������һ���ַ�д�����Ļ��������󣬲���ָ��Ҫ��������������������
		BufferedWriter bufw = new BufferedWriter(fw);
		
		//	ʹ�û�������д�뷽����������д�뵽��������
//		bufw.write("abcdefg" + LINE_SEPARATOR + "������");
		
		bufw.write("xixixi");
		bufw.newLine();
		bufw.write("����");
		
		//	ʹ�û�������ˢ�·���������ˢ��Ŀ�ĵ��С�
		bufw.flush();
		
		//	�رջ���������ʵ�رյľ��Ǳ������������
		bufw.close();
	}

}
