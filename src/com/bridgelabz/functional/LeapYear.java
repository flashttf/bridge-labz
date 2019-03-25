package com.bridgelabz.functional;

import java.util.Scanner;

public class LeapYear {
	public  static boolean checkLeapYear(int year) {
		if(year>999) {
			if((year%400==0)||((year%4==0)&&(year%100!=0))) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int year=sc.nextInt();
		
		boolean result=checkLeapYear(year);
		if(result) {
			System.out.println("Year: "+year+" is a leap year");
		}
		else {
			System.out.println("Year: "+year+" is not a leap year");
		}
		
	}
}