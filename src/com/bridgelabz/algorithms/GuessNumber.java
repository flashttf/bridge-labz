package com.bridgelabz.algorithms;

import java.util.Scanner;

public class GuessNumber {
	static Scanner sc =new Scanner(System.in);
	public static int search(int low,int high) {
		int y;
		if((high-low)==1) {
			return low;
		}
		int mid=low+(high-low)/2;
		System.out.println("Is it less than"+mid+"\n Enter 1 if less  else enter 0");
		y=sc.nextInt();
		//if(search(low,mid)==mid) {
		//	return mid;
		//}
		 if(y==1) {
			return search(low,mid);
		}
		else {
			return search(mid,high);
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter number");
		int n=sc.nextInt();
		int x=(int)Math.pow(2,n);
		int secret=search(0,x);
		System.out.println("Your number is "+secret);
	}
}
