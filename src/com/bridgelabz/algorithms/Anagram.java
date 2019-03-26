package com.bridgelabz.algorithms;

import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first string ");
	String string1=sc.nextLine();
	System.out.println("Enter second string");
	String string2=sc.nextLine();
	Utility u=new Utility();
	if(u.checkAnagram(string1, string2)) {
		System.out.println("Strings are anagram");
	}
	else {
		System.out.println("Strings are not anagram");
	}
}
}
