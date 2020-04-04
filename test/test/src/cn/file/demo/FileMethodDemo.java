package cn.file.demo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {

	public static void main(String[] args) throws IOException {

		/**
		 * 	File����ĳ�������
		 * 		
		 * 		1����ȡ��
		 * 			1.1����ȡ�ļ�����
		 * 			1.2����ȡ�ļ�·��
		 * 			1.3����ȡ�ļ���С
		 * 			1.4����ȡ�ļ��޸�ʱ��
		 * 
		 * 		2��������ɾ����
		 * 			
		 */
		
		getDemo();
		
		listDir();
	}

	private static void listDir() {
		
		File a = new File("c:\\");
		
		String[] names = a.list();
		
		for(String name: names) {
			System.out.println(name);
		}
	}

	private static void getDemo() throws IOException {
		
		File f = new File("a.txt");
		
		f.delete();
		
		String name = f.getName();
		
		String absPath = f.getAbsolutePath();
		
		String path = f.getPath();
		
		long len = f.length();
		
		long time = f.lastModified();
		
		Date date = new Date(time);
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String str_time = dateFormat.format(date);
		
		System.out.println("name====" + name);
		System.out.println("absPath====" + absPath);
		System.out.println("path====" + path);
		System.out.println("len====" + len);
		System.out.println("time====" + str_time);
		
		
	}

}
