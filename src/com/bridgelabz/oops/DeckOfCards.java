package com.bridgelabz.oops;

public class DeckOfCards {
	
	String suits[]= {"Clubs", "Diamonds", "Hearts", "Spades"};
	String ranks[]= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	String playerCards[][]=new String[5][15];
	//totalNoOfcards
	int totalNoOfCards=suits.length*ranks.length;
	
	String deck[]=new String[totalNoOfCards];	
		
	static int l=0;
	
	public  void getDeckOfCards() {
		
		for(int i=0;i<suits.length;i++) {					//assigning  cards in a deck
			for(int j=0;j<ranks.length;j++) {
				deck[l]=suits[i]+" "+ranks[j];
				l++;
				
			}
		}System.out.println(l);
	}
	
	public  String[] shuffleCards() {
		for(int i=0;i<totalNoOfCards;i++) {
			int random=(int)Math.random()*(totalNoOfCards);		//generating integer random number
			
			String tempPos=deck[random];						//shuffling the card based on generated random number
			deck[random]=deck[i];
			deck[i]=tempPos;
		}
		return deck;
	}
	
	public String[][] distribute(String[] deck){
		int k=0;
		for(int i=0;i<ranks.length;i++) {
			for(int j=0;j<suits.length;j++) {
				playerCards[i][j]=deck[k];
				deck[k]=" ";
				k++;
			}
		}
		return playerCards;
	}
	public void printDistributedCards(int m,int n) {
//		String[][] cardsDistributed=new String[m][n];
		
		for(int i=0;i<m;i++) {							//distributing to m persons
			
			 System.out.println("===Player " + (i + 1) + "==== ");
			    for (int j = 0; j < n; j++) {			//distributing n cards	
			        System.out.println(deck[i + j * 4] );
			    }
			    System.out.println();
		}
	}
}
