package com.basics.dataStructures;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
//		LisketList l2 - new LinkedList(Collection c);
		l.add(345);
		l.add("Naveen");
		l.add(null);
		System.out.println(l);
		
		l.set(1, 345645);
		
		System.out.println(l);
		
		l.add(1, 456);
		
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("Kumar");
		System.out.println(l);
		
	}

}
