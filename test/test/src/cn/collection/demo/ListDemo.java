package cn.collection.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		//插入元素
		list.add(3, "abc9");
		
		//删除元素
		System.out.println("remove：" + list.remove(2));
		
		//修改元素
		System.out.println("set：" + list.set(1, "哈哈哈"));

		//获取元素
		System.out.println(list.get(2));
		
		//获取子列表
		System.out.println(list.subList(1, 3));
	}

}
