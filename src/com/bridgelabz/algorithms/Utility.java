package com.bridgelabz.algorithms;

import java.util.Scanner;

public class Utility {
	
	
	
	
	//InputArray
	public static int[] inputArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		}
		return arr;
	}
	
	//Bubblesort method
	public static int[] bubble(int[] arr){
		int i,j;
		
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				int	temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}return arr;
	}
	
	//InsertionSort method
	public static int[] insert(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}
		
	
	//Print Sorted Array
	public static void printSortedArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	
}

