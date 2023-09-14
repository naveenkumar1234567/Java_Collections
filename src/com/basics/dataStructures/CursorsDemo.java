package com.basics.dataStructures;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {

		Vector ve = new Vector();
		System.out.println("Enter your input");
		for(int i =0;i<8;i++)
		{
			
			Scanner s = new Scanner(System.in);
			Integer inte = s.nextInt();
			ve.addElement(inte);
			
		}
		System.out.println("Vector: "+ve);
		Enumeration e= ve.elements();
		while(e.hasMoreElements())
		{
			Integer element = (Integer)e.nextElement();
			
			if(element%3==0)
			{
				System.out.println(element);
			}
		}
	}
	

}
