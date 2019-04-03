package com.bridgelabz.datastructures;

import com.bridgelabz.customDataStructure.UtilityDs;

public class PrimeNoUsing2Darray {
	public static void main(String[] args)
	{
		 
		int[][]result=UtilityDs.firstNPrimes();
		System.out.println("Prime Number Stored in 2D array :");
		System.out.println();
		for(int i = 0; i<10; i++)
		{
		    for(int j = 0; j<25; j++)
		    {
		        System.out.print(result[i][j]+"\t");
		    }
		    System.out.println();
		}
		
}
}
