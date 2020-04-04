package cn.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollelctionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		show(coll);
	}
	public static void show(Collection coll) {
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		
		//Iterator用法
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		for(Iterator it1 = coll.iterator(); it1.hasNext();) {
			System.out.println("第二种方式" + it1.next());
		}
	}

}
