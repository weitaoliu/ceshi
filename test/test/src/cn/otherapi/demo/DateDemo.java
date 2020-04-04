package cn.otherapi.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		/*
		 * 	���ڶ���ͺ���ֵ֮���ת��
		 * 	
		 * 	����ֵ ===> ���ڶ���
		 * 		1��ͨ��Date����Ĺ��췽�� new Date(timeMillis)
		 * 		2��ͨ��setTime����
		 * 	���ڶ��� ===> ����ֵ
		 * 		1��getTime()����
		 */
		
		method_1();
		
		method_2();
		
		method_3();
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		
		long str1 = dateFormat.parse("2012-3-17").getTime();
		long str2 = dateFormat.parse("2012-4-6").getTime();
		
		System.out.println((str2-str1)/1000/60/60/24);
		
	}


	private static void method_1() {
		long time = System.currentTimeMillis();
		
		System.out.println(time);
		
		Date date = new Date();
		System.out.println(date);
		
		Date date2 = new Date(1554346890448l);
		System.out.println(date2);
	}

	/**
	 * 	�����ڶ�����и�ʽ��
	 * 		
	 * 		�����ڶ���===>���ڸ�ʽ���ַ���
	 * 
	 * 			ʹ�õ���DateFormat���е�format()������
	 * 		
	 */
	
	private static void method_2() {
		
		Date date = new Date();
		
		//	��ȡ���ڸ�ʽ���󣬾���Ĭ�Ϸ��FULL��LONG���Եȿ���ָ�����
//		DateFormat dateFormat = DateFormat.getDateInstance();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		//	���������Զ������ν����
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		
		String time = dateFormat.format(date);
		
		System.out.println(time);
		
	}
	
	
	/**
	 * 	�����ڸ�ʽ���ַ���===>���ڶ���
	 * 
	 * 		ʹ�õ���DateFormat���е�parse()����
	 * 
	 * @throws ParseException 
	 */
	
	private static void method_3() throws ParseException {

		String time = "2019-4-4";
		time = "2019��4��4��";
		time = "2019---2---22";
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		dateFormat = new SimpleDateFormat("yyyy---MM---dd");
		
		Date date = dateFormat.parse(time);
		System.out.println(date);
	}
}
