package cn.io.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("demo.txt", true);
//		fw.write("��������\n");
		fw.write("������");
		fw.close();
	}

}
