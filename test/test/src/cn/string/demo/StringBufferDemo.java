package cn.string.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		/**
		 *  StringBuffer：就是字符串缓冲区。
		 *	用于存储数据的容器。
		 *	特点：
		 *	1，长度是可变的
		 *	2，可以存储不同类型的数据
		 *	3，最终要转成字符串进行使用
		 *	4，可以对字符串进行修改
		 *
		 *	既然是一个容器对象，应该具备什么功能？
		 *	1：添加
		 *		StringBuffer append(data);
		 *		StringBuffer insert(index, data)
		 *	2：删除
		 *		StringBuffer delete(start, end)：包含头不包含尾
		 *		StringBuffer deleteCharAt(int index)：删除指定位置的元素
		 *	3：查找
		 *		char charAt(index)
		 *		int indexOf(string)
		 *		int lastIndexOf(string)
		 *	4：修改
		 *		StringBuffer replace(start, end, string)
		 *		void setCharAt(index, char)
		 *	增删改查
		 */	
		bufferMethodDemo();
	}
	
	public static void bufferMethodDemo() {
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer();
		
//		StringBuffer s1 = sb.append(4).append("哈哈哈");
//		sb.insert(1, "呃呃呃");
//		sb.setLength(8);
		for (int i = 0; i < 20; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}
}
