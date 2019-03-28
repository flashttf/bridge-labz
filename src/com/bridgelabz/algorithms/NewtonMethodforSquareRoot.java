package com.bridgelabz.algorithms;

import java.util.Scanner;

public class NewtonMethodforSquareRoot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		double c=sc.nextDouble();
		double epsilon=1e-15;
		double t=c;
		                                                                          
		while(Math.abs(t-c/t)>epsilon*t) {
			t=(c/t+t)/2.0;
		}
		System.out.println(t);
	}
}
