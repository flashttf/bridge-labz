package com.bridgelabz.functional;

import java.util.Scanner;

public class PrimeFactor {

	public static int calculatePrimeFactors() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		int i=0;
		
		for(i=2;i<number;i++) {
			while(number%i==0) {
				if(i>=2) {
				System.out.println(i+" ");
				}
				number/=i;
			}
		}
		
		
		return number;
	}
	
	public static void main(String[] args) {
		calculatePrimeFactors();

	}
}
