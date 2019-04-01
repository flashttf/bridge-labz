package com.bridgelabz.datastructures;

import java.util.Scanner;



public class BalancedParanthesisDriverProgram {
	static Scanner scanner=new Scanner(System.in);
	public static void checkBalanceParanthesis() {
		UtilityDataStructures util=new UtilityDataStructures();
		char character;
		System.out.println("Enter expression");
		String expression=scanner.next();
		//UtilityDataStructures.Stack<char> stack=new Stack<char>();
		
		for(int i=0;i<expression.length();i++) {
			character=expression.charAt(i);
			if(character=='(' || character=='{' || character=='[') {
				util.stack.push(character);
			}
			else if(character==')' || character=='}' ||character==']') {
				util.stack.pop();
			}
		}
		
		if(util.stack.isStackEmpty()) {
			System.out.println("The given expression is balanced");
		}
		else {
			System.out.println("The given expression is not balanced");
		}
		scanner.close();
	}
	public static void main(String[] args) {
		checkBalanceParanthesis();
	}
}
