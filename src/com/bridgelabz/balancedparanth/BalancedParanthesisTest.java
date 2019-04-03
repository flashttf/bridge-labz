package com.bridgelabz.balancedparanth;

import java.util.Scanner;

public class BalancedParanthesisTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size");
		int n=sc.nextInt();
		
		StackLogic stack=new StackLogic(n);
		
		
			System.out.println("Enter expression");
			String expression=sc.next();
			int length=expression.length();
			
			
			for(int i=0;i<length;i++) {
				char ch=expression.charAt(i);
				if(ch=='(' || ch=='{' || ch=='[' ) {
					stack.push(i);
				}
				else if(ch==')' || ch=='}' || ch==']' ) {
					try {
						long p=(stack.pop()+1);
						System.out.println("Balanced expression");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("unbalanced");
					}
				}
			}
			
			while(!stack.isEmpty()) {
				System.out.println("Brace at index"+(stack.pop()+1)+" is unmatched");
			}
		
				
	}
}
