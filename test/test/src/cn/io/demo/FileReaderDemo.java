package cn.io.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("demo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
