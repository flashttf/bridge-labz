package com.bridgelabz.algorithms;

import java.util.Scanner;
public class PrimeNoRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range  from 0 to p");
		int p=sc.nextInt();
		for(int i=2;i<=p;i++) {
			if(Utility.checkPrime(i)) {
				
					System.out.println(i+" ");
				}
			}
		}
	
}
