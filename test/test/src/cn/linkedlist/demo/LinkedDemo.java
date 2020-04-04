package cn.linkedlist.demo;

public class LinkedDemo {

	public static void main(String[] args) {
		DuiLie dl = new DuiLie();
		
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		
		while(!dl.isNull()) {
			System.out.println(dl.myGet());
		}
	}

}
