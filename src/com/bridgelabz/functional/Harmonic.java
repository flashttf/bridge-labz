package com.bridgelabz.functional;

import java.util.Scanner;

public class Harmonic {
	static double n;
	public static double calculateHarmonic(){
		double result=0;
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextDouble();	
		for (int i = 1; i <= n; i++) {
			result=result+(1.0/i);
			
					
		}return result;
	}
	
	
	public static void main(String[] args) {
		
		double res=calculateHarmonic();
		System.out.println(res);
	}
}
