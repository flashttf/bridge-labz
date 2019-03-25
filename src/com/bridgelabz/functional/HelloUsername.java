package com.bridgelabz.functional;

import java.util.Scanner;

public class HelloUsername {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public static String printMessage() {
		Scanner sc=new Scanner(System.in);
		String s=" ";
		System.out.println("Enter your name:");
		s=sc.next();
		
		HelloUsername str1=new HelloUsername();
		str1.setUsername(s);
		System.out.println("Hello, "+str1.getUsername()+" how are you");
		sc.close();
		return s;
		
	}
	
	public static void main(String[] args) {
		printMessage();
	}
}
