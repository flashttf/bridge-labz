package com.bridgelabz.oops;

import java.util.Scanner;

public class DeckOfCardsUsingQueue extends DeckOfCards {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int no_of_players;
		int no_of_cards;
		QueueList<String> que=new QueueList<String>();
		DeckOfCards deck=new DeckOfCardsUsingQueue();
		
		
		try {
		System.out.println("Enter No of Players");
		no_of_players=scan.nextInt();
		
		System.out.println("Enter no of cards to be distributed");
		no_of_cards=scan.nextInt();
		
		deck.getDeckOfCards();
		deck.shuffleCards();
		
		String[][] cards=deck.distribute();
		
		for(int i=0;i<no_of_players;i++) {
			for (int j=0;j<no_of_cards;j++) {
				que.enqueue(cards[i][j]);
			}
		}
		
		
		for(int i=0;i<no_of_players;i++) {
			System.out.println();
			for(int j=0;j<no_of_cards;j++) {
				System.out.println(que.dequeu());
			}
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
