package com.bridgelabz.functional;

import java.util.Scanner;

public class PermutationString {
	
	public static void permuteString(){
		Scanner sc=new Scanner(System.in);
		String s1=" ";
		System.out.println("Enter String:");
		s1=sc.nextLine();
		permute(" ",s1);
	}

	private static void permute(String prefix, String s1) {
		
		int n=s1.length();
		if(n==0)
			System.out.println(prefix);
		else {
			for(int i=0;i<n;i++)
				permute(prefix+s1.charAt(i),s1.substring(0,i)+s1.substring(i+1,n));
		}
	}
	
	public static void main(String[] args) {
		permuteString();
	}

}
