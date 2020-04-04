package cn.io.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("demo.txt", true);
//		fw.write("込込込込\n");
		fw.write("待待待");
		fw.close();
	}

}
