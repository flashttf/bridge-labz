package com.bridgelabz.algorithms;

public class UtilityMainQuestion4 {
	public static void main(String[] args) {
		int[] array1= {1,5,8,2,3};
		int[] array2= {3,5,22,1,7};
		String str1="welcome to bridgelabz";
		
		long start=Utility.startT();
		Utility.bubble(array1);
		System.out.println("Sorted using Bubble Sort");
		Utility.printSortedArray(array1);
		long stop=Utility.stopT();
		
		
		System.out.println("\nUsing Binary Search for element=5 in array1");
		System.out.println(Utility.binarySearchInt(array1, 0, array1.length-1,5));
		
		System.out.println("Sorted array2 using Insertion Sort");
		Utility.insert(array2);
		System.out.println();
		Utility.printSortedArray(array2);
		long x=stop-start;
		System.out.println(x);
		System.out.println();
		int n=Utility.binarySearchString(str1,"bridgelabz");
		if(n==-1) {
			System.out.println("String not present");
		}
		else {
			System.out.println("String at index "+n);
		}
		
	}
}
