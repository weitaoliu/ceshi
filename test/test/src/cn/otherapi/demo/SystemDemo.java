package cn.otherapi.demo;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {

		/*
		 * 	System类中的方法和属性都是静态的。
		 * 
		 * 	常见方法：
		 * 		long currentTimeMillis();
		 * 	
		 */
		
		long l1 = System.currentTimeMillis();
		System.out.println(l1);
		
		demo_1();
	}

	public static void demo_1() {
		//	获取系统的属性信息，并存储到了Properties对象中
		/*
		 * 	Properties集合中存储的都是String类型的键和值
		 * 	最好使用它自己的存储和取出的方法来完成元素的操作
		 */
		Properties prop = System.getProperties();
		Set<String> nameSet = prop.stringPropertyNames();
		for(String str : nameSet) {
			System.out.println(str + "=====" + prop.getProperty(str));
		}
	}

}
