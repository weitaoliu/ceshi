package cn.otherapi.demo;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {

		/*
		 * 	System���еķ��������Զ��Ǿ�̬�ġ�
		 * 
		 * 	����������
		 * 		long currentTimeMillis();
		 * 	
		 */
		
		long l1 = System.currentTimeMillis();
		System.out.println(l1);
		
		demo_1();
	}

	public static void demo_1() {
		//	��ȡϵͳ��������Ϣ�����洢����Properties������
		/*
		 * 	Properties�����д洢�Ķ���String���͵ļ���ֵ
		 * 	���ʹ�����Լ��Ĵ洢��ȡ���ķ��������Ԫ�صĲ���
		 */
		Properties prop = System.getProperties();
		Set<String> nameSet = prop.stringPropertyNames();
		for(String str : nameSet) {
			System.out.println(str + "=====" + prop.getProperty(str));
		}
	}

}
