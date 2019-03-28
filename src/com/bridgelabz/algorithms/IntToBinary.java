package com.bridgelabz.algorithms;

import java.util.Scanner;

public class IntToBinary {
	public static void main(String[] args) {
		int n,m;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		while(n>0) {
			int bi=n%2;
			str=str+bi;
			n=n/2;
		}
		System.out.println(str);
		int k=0;
//		char[] ch=str.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			if(ch[i]==1) {
//			System.out.println(	Math.pow(2, k)+" ");
//			k++;}
//			else
//			{
//				k++;
//			}
//			}
		for (int i = 0; i >str.length(); i++) {
			if(str.charAt(i)=='1') {
				System.out.println(Math.pow(2,++k));
				
				
		}
			else {
				k++;
			}
		}
		}
	}

