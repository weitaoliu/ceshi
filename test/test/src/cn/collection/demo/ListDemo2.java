package cn.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
	public static void main(String[] args) {
		
		List list = new  ArrayList();
//		show(list);
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		System.out.println(list);
		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj.equals("abc2")) {
				it.add("��ӵ�abc");
			}
		}
		System.out.println(list);
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			
//			Object obj = it.next();		//	java.util.ConcurrentModificationException
//										//	�ڵ��������У���Ҫʹ�ü��ϲ���Ԫ�أ����׳����쳣
//										//	����ʹ��Iterator�ӿڵ��ӽӿ�ListIterator������ڵ����ж�Ԫ�ؽ��и���Ĳ���
//			if(obj.equals("abc2")) {
//				list.add("abc9");
//			} else {
//				System.out.println("next��" + obj);
//			}
//		}
	}

	public static void show(List list) {
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		
		for(Iterator it = list.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
		
		//list���е�ȡ��Ԫ�صķ�ʽ֮һ
		for(int x=0; x<list.size(); x++) {
			System.out.println(list.get(x));
		}
	}
}
