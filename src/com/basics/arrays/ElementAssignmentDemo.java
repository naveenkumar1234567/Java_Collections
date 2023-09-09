package com.basics.arrays;

public class ElementAssignmentDemo {

	
	public static void main(String[] args) {

		int [] x= new int[3];
		float[] y = new float[4];
		
		x[0]='a';
		System.out.println(x[0]);
		byte a=2;
		x[1]=a;
		System.out.println(x[1]);
		
		//-------------------------
		
		Object[] objArray = new Object[5];
		objArray[0] = new Object();
		objArray[1]= new String();
		
		
		
		//Abstract class array
		Number[] numArray = new Number[5];
		numArray[0]=new Integer(1);
		numArray[1]=new Byte("4");
		
		//------------------------------
		
		//Runnable is an Interface
		Runnable [] r = new Runnable[5];
		r[0]= new Thread();

		System.out.println(r[1]);
		
		
		
		
		
	}

}
