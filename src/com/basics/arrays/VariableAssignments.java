package com.basics.arrays;

public class VariableAssignments {

	public static void main(String[] args) {
		int[]x=new int[2];
		int []	a = x;
		x[0]=1;
		System.out.println(x[0]);
		System.out.println(a[0]);
		
		a[1]=2;
		System.out.println(x[1]);
		System.out.println(a[1]);
		
		//---------------
		
		int[]b= {1,2,3};
		int[]c= {11,12};
		b=c;
		
		c=b;
		
		for(int eac:b)	{	System.out.println(eac);}
		System.out.println("--------------");
		for(int eac:c) {System.out.println(eac); }
		//----------------------------------------
		
		
		String[] s = new String[3];
		Object[] objArray = s;
		
		
		short[] shorts = new short[3];  //[s
//		int[] inte= shorts;             //[I
		
		
		
		
		
		
	}
	
}
