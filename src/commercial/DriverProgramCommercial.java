package commercial;

import java.util.Scanner;

public class DriverProgramCommercial 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		try {
			boolean value = true;
			
			while(value)
			{
				StockAccount stockAccount = new StockAccount();
			
				System.out.println("Enter the choice");
				System.out.println("1. Add Stock Account");
				System.out.println("2. Get Total Value of Stock");
				System.out.println("3. Buy Shares");
				System.out.println("4. Sell Shares");
				System.out.println("5. Print Report");
				System.out.println("6. Exit");
				int n=scan.nextInt();
				switch(n)
				{
					case 1:StockAccount newStock = new StockAccount("Customer.json");
							break;
				
					case 2:	double totalValue = stockAccount.valueOf();
							if(totalValue >= 0)
							{
								System.out.println(totalValue);
							}
							break;
							
							
					case 3: System.out.println("Enter the shares");
							int shares = scan.nextInt();
							System.out.println("Enter the Symbol");
							String symbol = scan.next().toUpperCase();
							stockAccount.buy(shares, symbol);
							break;
							
					case 4: System.out.println("Enter the shares");
							shares = scan.nextInt();
							System.out.println("Enter the Symbol");
							symbol = scan.next().toUpperCase();
							stockAccount.sell(shares, symbol);
							break;
							
					case 5: stockAccount.printReport();
							break;
							
					case 6: System.out.println("EXit");
							value = false;
							break;
							
					default: System.out.println("invalid choice");
				}			
		
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
}}