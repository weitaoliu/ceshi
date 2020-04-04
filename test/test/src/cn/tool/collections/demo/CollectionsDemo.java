package cn.tool.collections.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		/*
		 * 	Collections：是集合框架的工具类，里面的方法都是静态的。
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

		//对List集合进行指定顺序的排序
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
