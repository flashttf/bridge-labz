package com.bridgelabz.oops;

import java.util.Random;

public class DeckOfCards {

	private String[] suits = { "Hearts", "Clubs", "Diamonds", "Spades" };
	private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static String[] cards = new String[52];

	public String[] getCards() {						//getting the card
		int i = 0;
		for (String suit : suits) {
			for (String card : ranks) {
				cards[i] = card + "-" + suit;
				i++;
			}
		}
		return cards;
	}

	public void shuffleCard() {								//shuffle Cards
		Random random = new Random();
		for (int i = 0; i < cards.length; i++) {
			int index = random.nextInt(52);					//random no genrator between 0 to 52. 0 inclusive and 52 exlcusive
			String temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}

	public String[][] distribute(int numOfPlayers, int numberOfCards) {		//cards are distributed
		String playerCards[][] = new String[numOfPlayers][numberOfCards];
		int k = 0;
		for (int i = 0; i < numOfPlayers; i++) {

			for (int j = 0; j < numberOfCards; j++) {
				playerCards[i][j] = cards[k];
				k++;
			}
		}
		return playerCards;
	}

	public void displayCards(String[][] playerCards) {					//display cards
		int i = 1;
		for (String[] player : playerCards) {
			System.out.println();
			System.out.println("player :" + (i++) + " cards : ");

			for (String card : player) {
				System.out.print(card + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		DeckOfCards deck = new DeckOfCards();

		deck.getCards();
		deck.shuffleCard();

		String playerCards[][] = deck.distribute(4, 9);

		deck.displayCards(playerCards);
	}
}