package cn.io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("data.txt", true);
		
		//	为了提高写入的效率，使用了字符流的缓冲区。
		//	创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联。
		BufferedWriter bufw = new BufferedWriter(fw);
		
		//	使用缓冲区的写入方法将数据先写入到缓冲区。
//		bufw.write("abcdefg" + LINE_SEPARATOR + "哈哈哈");
		
		bufw.write("xixixi");
		bufw.newLine();
		bufw.write("鹅鹅鹅");
		
		//	使用缓冲区的刷新方法将数据刷到目的地中。
		bufw.flush();
		
		//	关闭缓冲区，其实关闭的就是被缓冲的流对象。
		bufw.close();
	}

}
