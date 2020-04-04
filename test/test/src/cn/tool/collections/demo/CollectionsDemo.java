package cn.tool.collections.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		/*
		 * 	Collections���Ǽ��Ͽ�ܵĹ����࣬����ķ������Ǿ�̬�ġ�
		 */
		
		demo_1();
		
		int[] list = {1,2,3,6,89};
		System.out.println(Arrays.toString(list));
		
	}
	
	public static void demo_1() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("ee");
		list.add("dd");
		list.add("cba");

		//��List���Ͻ���ָ��˳�������
//		Collections.sort(list);
		mySort(list);
		System.out.println(list);
	}
	
	public static <T extends Comparable<? super T>> void mySort(List<T> list) {
		
		for (int i = 0; i < list.size() - 1; i++) {
			
			for (int j = 0; j < list.size(); j++) {
				
				if(list.get(i).compareTo(list.get(j)) > 0) {
				
					T temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
				}
			}
		}
	}

}
