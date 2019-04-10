package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.algorithms.Utility;

public class Coupon {
	
	//return a random coupon between 0 and n-1
	
	public static int generateCouponNo(int n) {
		return (int)(Math.random()*n);
	}
	
	//return no of coupons you collect before otaining one of each  of the n types//
	public static int collect(int n) {
		boolean[] isCollected=new boolean[n]; //isCollected[i]=true if card type i is already collected
		int count=0;						  //no of coups collected
		int distinct=0;						//no of distinct coups types collected
				
		while(distinct<n) {
		int	value=generateCouponNo(n);
			count++;
			if(!isCollected[value]) {
				distinct++;
				
				isCollected[value]=true;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of distinct coupons");
		int n=sc.nextInt();
		int counter=collect(n);
		System.out.println(counter);
	}
}
