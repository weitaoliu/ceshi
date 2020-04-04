package cn.otherapi.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		/*
		 * 	日期对象和毫秒值之间的转换
		 * 	
		 * 	毫秒值 ===> 日期对象
		 * 		1，通过Date对象的构造方法 new Date(timeMillis)
		 * 		2，通过setTime设置
		 * 	日期对象 ===> 毫秒值
		 * 		1，getTime()方法
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
	 * 	对日期对象进行格式化
	 * 		
	 * 		将日期对象===>日期格式的字符串
	 * 
	 * 			使用的是DateFormat类中的format()方法。
	 * 		
	 */
	
	private static void method_2() {
		
		Date date = new Date();
		
		//	获取日期格式对象，具有默认风格，FULL，LONG可以等可以指定风格
//		DateFormat dateFormat = DateFormat.getDateInstance();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		//	如果风格是自定义的如何解决？
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		
		String time = dateFormat.format(date);
		
		System.out.println(time);
		
	}
	
	
	/**
	 * 	将日期格式的字符串===>日期对象
	 * 
	 * 		使用的是DateFormat类中的parse()方法
	 * 
	 * @throws ParseException 
	 */
	
	private static void method_3() throws ParseException {

		String time = "2019-4-4";
		time = "2019年4月4日";
		time = "2019---2---22";
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		dateFormat = new SimpleDateFormat("yyyy---MM---dd");
		
		Date date = dateFormat.parse(time);
		System.out.println(date);
	}
}
