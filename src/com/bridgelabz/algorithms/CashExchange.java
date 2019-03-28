package com.bridgelabz.algorithms;

import java.util.Scanner;

public class CashExchange {	
	
	static int[] arrNotes= {2000,1000,500,200,100,50,20,10,5,2,1};		//declaring array on currency-notes
	static int i=0;														//i=0 for indexing			
	static int total=0;													//total no of notes	
	static int amount;
	
	public static int calNotes(int amount,int[] arrNotes) {
		int remainingAmount;
		if(amount==0) {
			return -1;
		}
		else {
			if(amount>=arrNotes[i]) {
				int noOfNotes=amount/arrNotes[i];
				remainingAmount=amount%arrNotes[i];
				amount=remainingAmount;
				total=total+noOfNotes;
				System.out.println(arrNotes[i]+"----->"+noOfNotes);
			}
			i++;
			return calNotes(amount, arrNotes);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amount=sc.nextInt();
		
		CashExchange.calNotes(amount, arrNotes);
		System.out.println("Total No of Notes"+total);
	}
}
