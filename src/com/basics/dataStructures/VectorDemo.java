package com.basics.dataStructures;

import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	
	
	Vector v = new Vector();
	Vector v2 = new Vector(60);
	Vector v3 = new Vector(100,5);
//	Vector v4 = new Vector(Collection c);
	v.add("Naveen");
	v.add(10);
	v.add(null);
	System.out.println(v);
	v.remove(2);
	System.out.println(v);
	System.out.println(v.get(1));
	System.out.println(v.elementAt(1));
	
	System.out.println(v.firstElement());
	System.out.println(v.lastElement());
	System.out.println(v.size());
	System.out.println(v.capacity());
	System.out.println(v3.capacity());
	
	v2.add(0, "Nae");
	v2.add(v3);
	System.out.println(v2);
	
	System.out.println(v2.size());
	System.out.println(v2.capacity());
	
	
}
}
