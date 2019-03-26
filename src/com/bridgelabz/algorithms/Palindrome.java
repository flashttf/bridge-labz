package com.bridgelabz.algorithms;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string to check for palindrome");
	String string1=sc.nextLine();
	Utility u=new Utility();
	if(u.checkPalindrome(string1)) {
		System.out.println(string1+" String is palindrome");
	}
	else {
		System.out.println(string1+" String is not a palindrome");
	}
}
}
