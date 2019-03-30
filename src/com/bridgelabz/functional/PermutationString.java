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

	private static void permute(String resultStr, String s1) {
		
		
		if(s1.isEmpty())
			System.out.println(resultStr+s1);
		else {
			for(int i=0;i<s1.length();i++) {
				//System.out.println(i);
				permute(resultStr+s1.charAt(i),s1.substring(0,i)+s1.substring(i+1,s1.length()));
		}
	}
}
	
	public static void main(String[] args) {
		permuteString();
	}

}
