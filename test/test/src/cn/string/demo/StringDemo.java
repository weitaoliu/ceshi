package cn.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * String����ص㣺 �ַ�������һ������ʼ���Ͳ��ᱻ�ı�
		 */
		method();
	}

	public static void method() {
//		byte[] arr = {97,98,99,100};
//		String s = new String(arr);
//		String s1 = " ";
//		System.out.println(s1.length());
//		String s2 = "С��,С��,С��";
//		System.out.println(s2.substring(2));
//		System.out.println(s2.substring(2, 5));

//		String[] arr1 = s2.split("a");
//		char[] char1 = s2.toCharArray();
//		for(int i=0; i<char1.length; i++) {
//			System.out.println(char1[i]);
//		}
//		
//		String s3 = "abc";
//		System.out.println(s3.toUpperCase());

		String s1 = new String("abc");
		String s2 = s1.intern();
		String s3 = "abc";
		System.out.println(s3 == s2);

	}

}
