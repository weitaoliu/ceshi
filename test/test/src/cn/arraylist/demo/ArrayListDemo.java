package cn.arraylist.demo;

import java.util.ArrayList;

import cn.a.bean.Person;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(new Person("����1", 21));
		al.add(new Person("����2", 22));
		al.add(new Person("����3", 23));
		al.add(new Person("����4", 24));
	}

}
