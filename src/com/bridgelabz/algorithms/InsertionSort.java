package com.bridgelabz.algorithms;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
	int[] arr=Utility.inputArray();
	
	int[] newArr=Utility.insert(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
	
}
	
