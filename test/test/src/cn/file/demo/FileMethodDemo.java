package cn.file.demo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {

	public static void main(String[] args) throws IOException {

		/**
		 * 	File对象的常见方法
		 * 		
		 * 		1，获取。
		 * 			1.1，获取文件名称
		 * 			1.2，获取文件路径
		 * 			1.3，获取文件大小
		 * 			1.4，获取文件修改时间
		 * 
		 * 		2，创建与删除。
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
