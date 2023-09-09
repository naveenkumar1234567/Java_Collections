package com.basics.generics;

import java.util.ArrayList;

public class DataStructureDemo {

	public static void main(String[] args) {
		String[] strArray = new String[20];
		
		Employee[] empArray = new Employee[20];
		strArray[0]="Naveen";
		ArrayList l = new ArrayList();
		//int-->Integer
		
		l.add("Naveen");
		l.add(new Employee());
		
	String s=	(String) l.get(0);
		Employee a = (Employee) l.get(0);
		
		
		
		
		
	}
}
