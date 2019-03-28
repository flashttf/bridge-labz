package com.bridgelabz.algorithms;

import java.util.Scanner;

public class GregorianCalendar {
	public static int gregoCalendar(int day,int month,int year) {
		int y0=year- (14-month) /12;
		int x=y0 + y0/4- y0/100 + y0/400;
		int m0=month + 12*((14-month)/12)-2;
		int d0=(day + x + (31*m0)/12)%7;
		return d0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=0;
		int m=0;
		int y=0;
		System.out.println("Enter day,month and year");
		d=sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		
		int ch=gregoCalendar(d, m, y);
		switch(ch)
		{
		case 0: System.out.println("Sunday");break;
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursday");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		}
			
	}
}
