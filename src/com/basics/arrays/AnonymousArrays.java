package com.basics.arrays;

public class AnonymousArrays {

	public static void main(String[] args) {
		
		
		sum( new int[] {1,3,4});
	}
	
	public static void sum(int []is)
	{
		int total =0;
		for(int e:is)
		{
			total=total+e;
		}
		System.out.println(total);
	}
	
}
