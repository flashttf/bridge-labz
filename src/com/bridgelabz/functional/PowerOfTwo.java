package com.bridgelabz.functional;

import java.util.Scanner;

public class PowerOfTwo {
	static long n;
	
	public static void calculateRaiseTo2() {
		long val;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		
		val=(long)Math.pow(2, n);
		System.out.println("Value of 2^"+n+" = "+val);
		for(int i=0;i<=n;i++) {
			System.out.println("2^"+i+" = "+(long)Math.pow(2,i));
			sc.close();
		}
	}
	
	public static void main(String[] args) {
		calculateRaiseTo2();
	}
}
