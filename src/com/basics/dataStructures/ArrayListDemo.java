package com.basics.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList a = new ArrayList(); //default size will be 10
		
		ArrayList arr2 = new ArrayList(30);
//		ArrayList arr3 = new ArrayList(Collection c);
		List al = new ArrayList();
		
		a.add("Naveen");
		a.add(true);
		a.add(3.4);
		a.add(738434399739479l);
		a.add(343);
		System.out.println(a);
//		System.out.println(a.get(3));
		
		a.remove(1);
		System.out.println(a);
		
		a.remove(new Integer(343));
		System.out.println(a);
		
		System.out.println(a.get(1));
		
		double d =(double) a.get(1);
		System.out.println(d);
		
		
		
		
		
		
		
		
		
		
	}

}
