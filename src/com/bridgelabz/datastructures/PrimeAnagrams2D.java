package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.customDataStructure.UtilityDs;

public class PrimeAnagrams2D {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter range : ");
		int range = sc.nextInt();
		int[] primeno = new int[range];
		primeno=UtilityDs.PrimeNumber(range);
		int[] anagram = UtilityDs.checkAnagram(primeno);		
		UtilityDs.twoDPrimeAnagram(anagram);
		sc.close();	
}
}
