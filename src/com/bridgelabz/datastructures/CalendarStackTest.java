package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.customDataStructure.UtilityDs;

public class CalendarStackTest {
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter month number");
			
			int month=scanner.nextInt();
			System.out.println("Enter year");
			int year=scanner.nextInt();
			System.out.println();
			scanner.close();
			
			UtilityDs.calenderStack(month, year);
			
		} catch (Exception e) {
			System.out.println("Invalid Input");		
	}
}
}
