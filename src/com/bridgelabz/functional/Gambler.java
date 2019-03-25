package com.bridgelabz.functional;

import java.util.Scanner;

public class Gambler {
	static int stake;
	static int goal;
	
	static int wins=0;
	static int bets=0;
	
	public static void gamble() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stake");
		stake=sc.nextInt();
		
		System.out.println("Enter goal");
		goal=sc.nextInt();
		
		System.out.println("Enter no of bets");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int cash=stake;
			while(cash>0&&cash<goal) {
				bets++;
			
				if(Math.random()>.5) 
					cash++;
				
				else 
					cash--;
				
				if(cash==goal)
					wins++;
				
			}
		}
		
		System.out.println("No of wins is: "+wins);
		double percentWins=((double)wins/n)*100;
		System.out.println("Percent of wins: "+percentWins);
		System.out.println("Percent of losses: "+(100-percentWins));
	}
	
	public static void main(String[] args) {
		gamble();
	}
}
