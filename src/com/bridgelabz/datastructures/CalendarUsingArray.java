package com.bridgelabz.datastructures;

import java.util.Scanner;

public class CalendarUsingArray {
	

	 public static int day(int month, int day, int year) {	//to give day on given date.
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;				//day on given date.	
	        return d;
	    }
	 
	 public static boolean isLeapYear(int year) {						//to check given year is leap year.
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }
	 
public static void main(String[] args) {
	try {
		String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[] days= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter month");				//enter month number
		int month=sc.nextInt();
		System.out.println("Enter year");				//enter month year
		int year=sc.nextInt();
		System.out.println();
	
		
		if(month==2 && isLeapYear(year)) {				//check if given year is leap year
			days[month]=29;								// if leap year, then feb will have 29 days.
		}
		
		//starting day function call.
		int d=day(month,1,year); 							//function call to day.
		System.out.println(" "+months[month-1]+" "+year+"\n");	//printing Month name and year.
	
		System.out.println(" S  M Tu  W Th  F  S");
		
		for(int i=0;i<d;i++) {
			System.out.print("   ");
		}
		for(int i=1;i<=days[month];i++) {

			System.out.printf("%2d ", i);
			if(((i+d)%7==0)||(i==days[month])) {
				System.out.println();
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
