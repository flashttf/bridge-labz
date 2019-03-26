package com.bridgelabz.algorithms;

import java.util.Scanner;

public class Utility {
	
	
	
	
	//-------------InputArray------------------////////////
	
	public static int[] inputArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		}
		return arr;
	}
	////////////////////////////////////////////////////////
	
	
	
	//-----------Bubblesort method---------------//////////////////
	
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
	//////////////////////////////////////////////
	
	
	
	
	////////----------InsertionSort method------------------//////////////
	
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
	//////////////////////////////////	
	
	////////////////------------------Print Sorted Array-----------/////////////////////
	
	public static void printSortedArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	////////////////////////////////////
	
	
	//////////////----------------AnagramFunction-------------////
	
	public static boolean checkAnagram(String string1,String string2 ) {
		//If length is not equal Strings are not anagram
		if(string1.length()!=string2.length()) {
			return false;
		}
		for(int i=0;i<string2.length();i++) {
			char c=string1.charAt(i);
			if(string2.indexOf(c)==-1) 
				return false;
			}
		return true;
	}
	/////////////////////////////////////////////////////////////////////////////
	
	
	//////////---------PalindromFunction---------------////////////////
	
	public static boolean  checkPalindrome(String string1) {
		int  n=string1.length();
		String reverse="";
		for(int i=n-1;i>=0;i--) {
			reverse=reverse+string1.charAt(i);
			
		}
		
		
		if(reverse.equals(string1)) {
			return true;
			}
		return false;
	}
	///////////////////////////////////////////////////////////////////       
	
	/////--------checkPrime Function------------///////////////////////
	
	public static boolean checkPrime(int n) {
		
		int flag=1;							//Assume number is prime					
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {					//True if number isnot prime.
				flag=0;
				break;						//loop terminates if number is prime.			
			}
		}
		if(flag==0||n==0||n==1) {
			return false;
		}
		else {
			return true;
		}
	}
	//////////////////////////////////////////////////////
	
	////-------Palindrome Number-function---//////////////
	
	public static boolean ispalindromeNum(int n) {
		int r;
		int temp;
		int rev=0;
		int flag=1;
		
		temp=n;
		while(n!=0) {
			r=n%10;
			rev=rev+r;
			n=n/10;
		}
		
		
		if(temp==rev) { 
		flag=1;							//if flag==1 number is palindrome.								
		}
		else {
			flag=0;
		}
		
		
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	////----check if given number is palindrome-----////

	//////////////////////////////////////////////
	
	
}

