package com.bridgelabz.algorithms;

import java.util.Scanner;

public class Payment {
	
	
	public static double monthlyPayment(int pr,int ye,double ra) {
		double payment=0;
		int n;
		double r;
		n=12*ye;
		r=(double)ra/(12*1000);
		payment=pr*r/(1-Math.pow((1+r),-n));
		return payment;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int pr;
		 int ye;
		 double ra;
		 double result;
		
		System.out.println("Enter principal amount,no of years and rate of interest");
		pr=sc.nextInt();
		ye=sc.nextInt();
		ra=sc.nextDouble();
		result=monthlyPayment(pr, ye, ra);
		System.out.println("Monthly Payment is "+result);
	}
}
