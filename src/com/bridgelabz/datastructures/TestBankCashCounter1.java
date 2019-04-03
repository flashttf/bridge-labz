package com.bridgelabz.datastructures;

import java.util.Scanner;
import com.bridgelabz.customDataStructure.*;


public class TestBankCashCounter1 {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		int amount=0;
		int balance=10000;
		System.out.println("Enter no of people in queue");
		int n=scanner.nextInt();
		Queue1<String> new_que=new Queue1<String>(n);
		try {
			for(int i=1;i<=n;i++) {
				System.out.println("Enter name of "+i+" person");
				String name=scanner.next();
//				boolean enter=new_que.enqueue(toString(name));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
