package cn.io.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {

	public static void main(String[] args) throws IOException {
			
		copy_1();
		copy_2();
	}

	private static void copy_2() {
		
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader("data.txt");
			writer = new FileWriter("copyData2.txt");
				
			//	����һ����ʱ���������ڻ����ȡ�����ַ�
			char[] arr = new char[1024];
			
			//	����һ��������¼��ȡ�����ַ���(Ҳ��������ʱ�������������ַ���)
			int len = 0;
			
			while((len=reader.read(arr))!=-1) {
//				writer.write(arr);
				writer.write(arr, 0, len);
			}	
			
		} catch (IOException e) {
			
		} finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("reader�ر�ʧ��");
				}
			}
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("writer�ر�ʧ��");
				}
			}
		}
		
	}

	private static void copy_1() throws FileNotFoundException, IOException {
		FileReader reader = null;
		FileWriter writer = null;
		
		reader = new FileReader("data.txt");
		writer = new FileWriter("copyData.txt");
		
		int ch = 0;
		
		while((ch=reader.read())!=-1) {
			writer.write(ch);
		}
		
		reader.close();
		writer.close();
	}

}
