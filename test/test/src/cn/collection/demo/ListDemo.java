package cn.collection.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		//���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		//����Ԫ��
		list.add(3, "abc9");
		
		//ɾ��Ԫ��
		System.out.println("remove��" + list.remove(2));
		
		//�޸�Ԫ��
		System.out.println("set��" + list.set(1, "������"));

		//��ȡԪ��
		System.out.println(list.get(2));
		
		//��ȡ���б�
		System.out.println(list.subList(1, 3));
	}

}
