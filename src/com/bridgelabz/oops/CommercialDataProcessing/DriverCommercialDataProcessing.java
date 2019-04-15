package com.bridgelabz.oops.CommercialDataProcessing;

import java.util.Scanner;

public class DriverCommercialDataProcessing {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	boolean value=true;
	
	 try {
		while(value) {
			StockAccount stockAccount=new StockAccount();
			
			System.out.println("Enter Choice");
			System.out.println("1.Add Stock Account");
			System.out.println("2.Get Total Value of each Stock");
			System.out.println("3.Buy Shares");
			System.out.println("4.Sell Shares");
			System.out.println("5.Print Report");
			System.out.println("6.EXIT");
			
			int n=scan.nextInt();	
			
			switch (n) {
			case 1:	StockAccount newStockAccount=new StockAccount("Customer.json");
				
				break;
				
			case 2:
				double totalValue = stockAccount.valueOf();
				if(totalValue >= 0)
				{
				System.out.println(totalValue);
				}
				break;
				
			case 3:
				System.out.println("Enter shares");
				int shares=scan.nextInt();
				System.out.println("Enter Symbol of stock");
				String symbol=scan.nextLine().toUpperCase();
				stockAccount.buy(shares, symbol);
				break;
				
			case 4:	System.out.println("Enter shares");
					shares=scan.nextInt();
					System.out.println("Enter Symbol of stock");
					symbol=scan.nextLine();
				break;
				
			case 5:stockAccount.printReport();
				break;
			case 6:System.out.println("EXIT");
					value=false;
					
				break;
			default:System.out.println("Invalid Choice");
				break;
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
