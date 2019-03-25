package com.bridgelabz.functional;

import java.util.Scanner;

public class CoinFlip {
	static int heads=0;
	static int tails=0;
	static int count=1;
	
	static double randNum=0;
	static double percentHeads=0;
	static double percentTails=0;
	
	public static void  calculateHeadsTailsPercent() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of times coins to be flipped:");
		int flips=sc.nextInt();
		
		for(int i=1;i<flips;i++){
				randNum=Math.random();
				if(randNum<0.5) {
					heads++;
				}
				else {
					tails++;
				}
			
		}
		percentHeads=(((double)(heads)/flips)*100);
		percentTails=100-percentHeads;
		System.out.println("Percentage of heads is: "+percentHeads);
		System.out.println("Percentage of Tails is: "+percentTails);
		sc.close();
	}
	
	public static void main(String[] args) {
		calculateHeadsTailsPercent();
	}
}
