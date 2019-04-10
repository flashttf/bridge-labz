package com.bridgelabz.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	
		public static long startTime=0;
		public static long stopTime=0;
		public static long elapsedTime;
	
	public static long startT()
	{
		startTime=System.currentTimeMillis();
		return startTime;
	}
	
	public static long stopT() {
		stopTime=System.currentTimeMillis();
		return stopTime;
	}
	
	
//	public static long elapsedT() {
//		elapsedTime=stopTime-startTime;
//		return elapsedTime;
//	}
	///////////--------InputArray--------////////////
	
	public static int[] inputArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		}
		return arr;
	}
	//<----------------------------------------------------------------->//
	
	/*---Sort charArray--
	 * 
	 */
	public static String sort(char[] ch) {
		String result="";
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			result=result+ch[i];
		}
		return result;
	}
	
	//<----------------------------------------------------------------->//
	
	
	
	//-----------Bubblesort method---------------//////////////////
	
	public static int[] bubble(int[] arr){
		int i,j;
		
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {										//comparing element at index j and immediate next position				
				int	temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}return arr;
	}
	//////////////////////////////////////////////
	
	/////////-BubbleSort String---////////////
	
	public static String bubbleString(String str) {
		String temp;
		String strArray[]=str.split(" ");
		for(int i=0;i<strArray.length;i++) {
			for(int j=i+1;j<strArray.length;j++) {
				if(strArray[i].compareTo(strArray[j])>0) {
					temp=strArray[j];
					strArray[j]=strArray[i];
					strArray[i]=temp;
				}
			}
		}
		return strArray.toString();
	}
	//<----------------------------------------------------------------->//

	
	
	
	
	
	////////----------InsertionSort method------------------//////////////
	
	public static int[] insertSort(int[] arr) {
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
	//<----------------------------------------------------------------->//
	
	///////////////////--InsertionSort String---///////////
	
	public static String insertionSortString(String str) {
		String strArray[]=str.split(" ");						//converting to string array
		int n=strArray.length;
		String temp="";
		for(int i=1;i<n;i++) {
			String key=strArray[i];
			int j=i-1;
			while((j>=0) && key.compareTo(strArray[j])<0) {
				strArray[j+1]=strArray[j];
				j--;
			}
			strArray[j+1]=key;
		}
		for (int i = 0; i < strArray.length; i++) {
			temp+=strArray[i]+" ";
		}
		
		return temp;
	}
	//<----------------------------------------------------------------->//
	
	////////////////------------------Print Sorted Array-----------/////////////////////
	
	public static void printSortedArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	//<----------------------------------------------------------------->//
	
	
	
	//////////////----------------AnagramFunction-------------////
	
	public static boolean checkAnagram(String string1,String string2 ) {
		
		String s1=sort(string1.toCharArray());
		String s2=sort(string2.toCharArray());
		
		//If length is not equal Strings are not anagram
		if(string1.length()!=string2.length()) {
			return false;
		}
//		for(int i=0;i<string2.length();i++) {				//checking anagram by indexOf index is p
//			char c=string1.charAt(i);
//			if(string2.indexOf(c)==-1) 
//				return false;
//			}
//		return true;
		if(s1.equals(s2)) {
			return true;
		}
		else {
			return false;
		}
	
	}
	//<----------------------------------------------------------------->//
	
	
	
	//////////---------PalindromFunction---------------////////////////
	
	public static boolean  checkPalindrome(String string1) {
		int  n=string1.length();
		String reverse="";
		for(int i=n-1;i>=0;i--) {
			reverse=reverse+string1.charAt(i);				//append the element at i to string reverse
			
		}
		
		
		if(reverse.equals(string1)) {
			return true;
			}
		return false;
	}
	//<----------------------------------------------------------------->//   
	
	
	
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
	//<----------------------------------------------------------------->//
	
	
	
	////-------Palindrome Number-function---//////////////
	
	public static boolean ispalindromeNum(int n) {
		int r;
		int temp;
		int rev=0;
	
		
		temp=n;
		while(n!=0) {								//reversing the number
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		
		
		
		
		
		if(temp==rev) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

	//<----------------------------------------------------------------->//
	
	
	
	//////////-----to reverse a number---//////////
	
	public static int toReverseNum(int n) {
		int  r;
		int temp;
		int rev=0;
		
		temp=n;
		while(n!=0) {
			r=n%10;						//first digit
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
	//<----------------------------------------------------------------->//
	
	
	/////-----to count digits of  a number-////////////
	
	public static int countDigits(int n) {
		int digits=0;
		int r;
		int temp;
		if(n==0) {
			return 1;
		}
		else {
			temp=n;
			while(n!=0) {
				++digits;
				n=n/10;
			}
			return digits;
		}
	}
	//------------------------------------------------------------------------------------------------------------------//
	public static long countDigits(long n) {
		long digits=0;
		long r;
		long temp;
		if(n==0) {
			return 1;
		}
		else {
			temp=n;
			while(n!=0) {
				++digits;
				n=n/10;
			}
			return digits;
		}
	}
	//<----------------------------------------------------------------->//
	
	//////////////////-----------Binary Search Integer(Sorted array only)------//////////////
	
	public static int binarySearchInt(int[] arr,int low,int high,int x) {
		if(high>=1) {
			int mid=low+(high-low)/2;									
			if(arr[mid]==x)														//if element to find matches with element at position mid
				return mid;
			
			if(arr[mid]>x)
				return binarySearchInt(arr, low, mid-1, x);						//if element falls in the range less than mid
			return binarySearchInt(arr, mid+1, high, x);						//if element falls in the range greater than mid
			
		}
		return -1;
	}
	//<----------------------------------------------------------------->//
	
	///////////////////---BinarySearch String-----//////////
	
	public static int binarySearchString(String str,String x) {
		String strArray[]=str.split(" ");			//convertiing the given string to string array
		Arrays.sort(strArray);
		int low=0;
		int high=strArray.length-1;
		while(low<=high) {                             
			int mid=low+(high-low)/2;
			int result=x.compareTo(strArray[mid]);
			if(result==0)
				return mid;
			if(result>0)
				low=mid+1;
			else
				high=mid-1;
		}
		return  -1;
	}
	//<----------------------------------------------------------------->//
	/*-----MergeSort Method
	 *  
	 */
	public static void mergeSort(int[] arr,int low,int high) {
	if(low<high) {	
		int mid=(low+high)/2;						//to find mid index.
		
		mergeSort(arr,low,mid);						//to sort first left subarrays	
		mergeSort(arr,mid+1,high);					//to sort rigth subarray
		
		merge(arr,low,mid,high);					//mergesorted arrays
	}
		
	}
	
	
	/*------Merge function
	 * 
	*/
		public static void merge(int[] arr,int low,int mid,int high) {
		
		int n1=mid-low+1;							//to calculate size of left-subarray
		int n2=high-mid;							//to calculate size of right-subarray
		
		int[] leftArr=new int[n1];					//creating the left-temp arrays
		int[] rightArr=new int[n2];					//creating right-temp subarray
		
		for(int i=0;i<n1;i++) {						//copy elements of array less than mid+1 to left sub array
			leftArr[i]=arr[low+i];
		}
		
		for(int j=0;j<n2;j++) {						//copy elements of array greater than mid to right sub array.	
			rightArr[j]=arr[mid+1+j];
		}
		
		int i=0;									//initial index of left-temp subarray
		int	j=0;									//initial index of right-temp subarray
		
		int k=low;
		
		while(i<n1 && j<n2) {						//merging
		 	if(leftArr[i] <= rightArr[j]) {			//if element in left is less than right then place in array at position k	
				arr[k]=leftArr[i];
				i++;
			}
			else {
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {								//copying remaining elements of left-subarray to array
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		
		while(j<n2) {								//copying remaining elements of right-subarray to array
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	//<----------------------------------------------------------------->//
		
		
}

