package com.bridgelabz.algorithms;

import java.util.Scanner;

public class IntToBinary {
	public static void main(String[] args) {
		int n,m,x;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		while(n!=0) {
			int bi=n%2;
			str=str+bi;
			n=n/2;
		}
		
		

		for (int i = str.length()-1; i >=0; i--) {
			if(str.charAt(i)=='1') {
				x=(int)Math.pow(2,i);
				System.out.print(x);
				
				System.out.print(" + ");
				
		}
			
		}
		}
	}

