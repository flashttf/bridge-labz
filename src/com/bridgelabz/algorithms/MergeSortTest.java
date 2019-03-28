package com.bridgelabz.algorithms;

public class MergeSortTest {
	public static void main(String[] args) {
		int[] arr= {22,5,7,2,3,11,1};
	System.out.println("Given array is:");
	Utility.printSortedArray(arr);

	System.out.println("\nSorted using mergeSort");
	Utility.mergeSort(arr, 0, arr.length-1);
	Utility.printSortedArray(arr);
	}
}
