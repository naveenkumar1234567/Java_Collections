package com.basics.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	
		int x[];
		
	
		int []y = {1,2,3,4,5};
		
		int []z = new int[3];
		//default value will be zero
		System.out.println(z[0]);
		System.out.println(z[1]);
		System.out.println(z[2]);
		
		z[0]=4;
		z[2]=5;
		z[1]=3;
		for(int each :z)
		{
			System.out.println(each);
		}
		
		System.out.println(z);
		//gives [I@7c30a502 [I is class name and @hashcode
		
		//------------------------------------------------
		
		int[][] c;
		int[][]	g= new int [2][];
		
		System.out.println(g[1]);
//		System.out.println(g[0][0]);

		int r[][]= {{1,3,4},{3,5,6}};
		
		for(int[] array : r)
		{
			for(int ele : array)
			{
				System.out.println(ele);
			}
		}
	}
}
