package com.bridgelabz.functional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quadratic {
	public static void findQuadraticRoots(){
		double a,b,c;
		double root1,root2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b,c for the quadratic equation a*x*x+b*x+c " );
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		
		double determinant=b*b-4*a*c;
		
		if(determinant>0) {
		 root1=(double)(-b+Math.sqrt(determinant))/(2*a);
		 root2=(double)(-b-Math.sqrt(determinant))/(2*a);
		System.out.println("Root1 is "+root1);
		System.out.println("Root2 is "+root2);
		}
		else if(determinant==0)
		{
		root1=root2=-b/(2*a);
		System.out.println("Real and equal roots "+root1);
		}
		else {
			double realPart=-b/(2*a);
			double imaginaryPart=Math.sqrt(-determinant)/(2*a);
			System.out.format("Root1= %.2f+%.2fi and Root2= %.2f-%.2fi ",realPart,imaginaryPart,realPart,imaginaryPart);
		}
	}
	
	
	public static void main(String[] args) {
	
		findQuadraticRoots();
	}
}
