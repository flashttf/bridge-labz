package com.bridgelabz.algorithms;

import java.util.Scanner;

public class BubbleSort {
	public static void bubble(int[] arr,int n){
		int i,j;
		
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				int	temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int  n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		
	}
	bubble(arr,n);
	
}
}
