package com.bridgelabz.oops;

import java.util.Scanner;

public class TestDeck {
public static void main(String[] args) {
	try {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter no of Players");
	int m=sc.nextInt();
	System.out.println("Enter no cards to be distributed(Less than 14 and greater than 0)");
	int n=sc.nextInt();
	if(n<14 && n>0) {
	DeckOfCards obj=new DeckOfCards();
	obj.getDeckOfCards();
	obj.shuffleCards();
	obj.printDistributedCards(m, n);
	}
	else {
		System.out.println("Invalid Input");
	}
	}
	catch(Exception e) {
		System.out.println("Invalid Input");
	}
}
}
