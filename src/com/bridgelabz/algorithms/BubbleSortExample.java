package com.bridgelabz.algorithms;



public class BubbleSortExample {
public static void main(String[] args) {
	int arr[]=Utility.inputArray();
		
	
	int ar[]=Utility.bubble(arr);
	System.out.println("Sorted array is as shown");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
}
