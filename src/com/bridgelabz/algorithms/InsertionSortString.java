package com.bridgelabz.algorithms;

import java.util.Scanner;

public class InsertionSortString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String temp=Utility.insertionSortString(str);
		System.out.println(temp);
	
	
	}

}
