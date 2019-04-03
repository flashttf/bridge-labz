package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.customDataStructure.QueueForCalendar;

public class CalendarUsingQueue {
	public static void main(String[] args) {
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter month number");
			int month=scan.nextInt();
			System.out.println("Enter year number");
			int year=scan.nextInt();
			scan.close();
			if((month>0 && month<13)&&(year>999&&year<10000)) {
				QueueForCalendar.calenderQueue(month, year);
			}
			else
				System.out.println("Enter valid input");
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Enter valid input");
		}
	}
}
