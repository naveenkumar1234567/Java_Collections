package com.basics.dataStructures;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(10);
		s.push(null);
		s.push("Naveen");
		System.out.println(s);
	Object o = s.pop();
	System.out.println(s);
	Object o2 =s.peek();
	System.out.println(o2);
	System.out.println(s);
	System.out.println(s.isEmpty());
	
	System.out.println(s.search(10));
	
	}
	
}
