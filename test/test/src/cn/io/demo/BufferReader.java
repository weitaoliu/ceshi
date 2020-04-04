package cn.io.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {

		method_1();
	}

	private static void method_1() throws IOException {
		
		FileReader fr = new FileReader("data.txt");
		BufferedReader bufr = new BufferedReader(fr);
		String str = "";
		while((str = bufr.readLine())!=null) {
			System.out.println(str);
		}
		bufr.close();
	}

}
