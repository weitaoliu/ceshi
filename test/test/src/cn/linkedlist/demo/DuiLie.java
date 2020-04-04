package cn.linkedlist.demo;

import java.util.LinkedList;

public class DuiLie {

	private LinkedList link;
	
	public DuiLie() {
		link = new LinkedList();
	}
	
	public void myAdd(Object obj) {
		link.add(obj);
	}
	
	public Object myGet() {
		return link.removeFirst();//∂”¡–
//		return link.removeLast();//∂—’ª
	}
	
	public boolean isNull() {
		return link.isEmpty();
	}
}
