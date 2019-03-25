package com.bridgelabz.functional;

import java.util.Scanner;

public class SwapNibble {
	
	public static int swapNibbleMethod(int x) {
		return((x&0x0F)<<4|(x&0xF0)>>4);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int x=sc.nextInt();
		System.out.println(swapNibbleMethod(x));
		System.out.println(Integer.toBinaryString(swapNibbleMethod(x)));
	}
}