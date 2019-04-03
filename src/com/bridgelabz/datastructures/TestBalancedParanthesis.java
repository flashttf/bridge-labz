package com.bridgelabz.datastructures;

import java.util.Scanner;

public class TestBalancedParanthesis {
	public static void checkForBalancedParenthesis()
	{
		Scanner sc = new Scanner(System.in);
		int top = -1, result = 0;
		char stack[] = new char[20];  
		char a = 0, b = 0;
		String expression;
	try {
		System.out.println("enter your expression:");
		expression = sc.next();  
		sc.close();
		int strLength = expression.length();  

		for (int i = 0; i < strLength; i++) {

			if (expression.charAt(i) == '{' || expression.charAt(i) == '[' || expression.charAt(i) == '(')
			{
				top++; 								// increment top
				stack[top] = expression.charAt(i);	// if true then push it into stack

			}

			else if (expression.charAt(i) == '}' || expression.charAt(i) == ']' || expression.charAt(i) == ')') 
			{
				b = expression.charAt(i);
				a = stack[top]; // pop element from stack
				top--; // decrement top
			}

			result = 0;
			if ((a == '{' && b == '}') || (a == '[' && b == ']') || (a == '(' && b == ')')) // if condition is true set
																							// result to 1
				result = 1;
		}

		if (result == 1 && top == -1) // if result is 1 and stack is empty then true else false
			System.out.println("expression is balanced..");

		else
			System.out.println("unbalanced");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Unbalanced Equation");
	}
	
	}

	public static void main(String[] args) 
	{
 
			checkForBalancedParenthesis();
	}
}