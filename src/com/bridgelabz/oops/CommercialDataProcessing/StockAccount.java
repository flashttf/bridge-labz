package com.bridgelabz.oops.CommercialDataProcessing;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockAccount implements StockInterface{
	
	static Scanner scan=new Scanner(System.in);
	Stack stack=new Stack(100);
	StackList stackList=new StackList();
	LinkedList linkedlist=new LinkedList();
	Queue queue=new Queue(100);
	QueueList queueList= new QueueList();
	
	private Customer customer;
	private CompanyShares companyShares;
	
	static ObjectMapper objectMapper=new ObjectMapper();
	
	File customerFile=new File("/home/admin1/Desktop/pawan/Customer.json");
	File companyShareFile=new File("/home/admin1/Desktop/pawan/CustomerShares.json");
	
	 public StockAccount() {							//Constructor
		// TODO Auto-generated constructor stub
	}
	 
	 public StockAccount(String filename) {				//Constructor
		 StockUtility.addAccount(filename);
	 }

	 
	@Override
	public double valueOf() {					//calculates total value of stock of customer
		
		try {
			List<Customer> customerList=objectMapper.readValue(customerFile, 
					new TypeReference<List<Customer>>(){});
			
			List<CompanyShares> companySharesList=objectMapper.readValue(companyShareFile,
						new TypeReference<List<CompanyShares>>(){});
			
			System.out.println("Enter Customer name");
			String searchName=scan.nextLine().toUpperCase();
			
			int index=StockUtility.searchCustomerIndex(searchName, customerList);
			
			if(index==-1) {
				Customer customer=new Customer();
				customer=customerList.get(index);
				
				int airtelShares=companySharesList.get(index).getPrice()*customer.getAirtelShares();
				int relianceInfraShares=companySharesList.get(index).getPrice()*customer.getRelInfraShares();
				int tataSteelShares=companySharesList.get(index).getPrice()*customer.getTataSteelShares();
				
				int totalValue=airtelShares+relianceInfraShares+tataSteelShares;
				System.out.println("TotalShare");
				
				System.out.println("Total Value of Stock:");
				
				return (double)totalValue;
			}
			else {
				return -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	/*Buy method
	 * 
	 * 
	 */
	@Override
	public void buy(int amount, String symbol) {
		try {
			
			List<CompanyShares> companySharesList=objectMapper.readValue(companyShareFile, 
					new TypeReference<List<CompanyShares>>(){});
			
			List<Customer> customerList=objectMapper.readValue(customerFile, 
					new TypeReference<List<Customer>>(){});
			
			System.out.println("Enter the Person Name");
			String searchName=scan.nextLine().toUpperCase();
			
			int customerIndex=StockUtility.searchCustomerIndex(searchName, customerList);
			int stockPosition=StockUtility.searchSharesSymbol(symbol, companySharesList);
			
			String stockSymbol=null;
			CompanyShares companyShares=null;
			
			if(customerIndex!=-1) {
				companyShares=companySharesList.get(stockPosition);
				int no_of_shares=companyShares.getNoofShares();
				companyShares.setNoofShares(no_of_shares-amount);
				stockSymbol=companyShares.getStockSymbol();
				
				Customer customer=customerList.get(customerIndex);
				if(stockPosition==0) {
					int value=customer.getAirtelShares();
					customer.setAirtelShares(value+amount);
				}
				if(stockPosition==1) {
					int value=customer.getRelInfraShares();
					customer.setRelInfraShares(value+amount);
				}
				if(stockPosition==2) {
					int value=customer.getTataSteelShares();
					customer.setTataSteelShares(value+amount);
				}
				else {
					System.err.println("Stock Not Found");
				}
				
			}
			
			System.out.println("\n========Stock Details==========");
			System.out.printf("%-15s %-20s %-20s\n", "Company_Name", "NO._of Stocks", "Price");
			System.out.println(companySharesList.get(stockPosition).toString());
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "AIRTEL(Shares)", "RELIANCEINFRA(Shares)",
					"TATASTEEL(Shares)");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println(customerList.get(customerIndex).toString());
			System.out.println("Company Shares List");
			addToList();
			linkedlist.showList();
			
			System.out.println("-----------------------------------------------------------------");
			
			stack.push(stockSymbol);
			System.out.println("Company Symbol in Stack List");
			stackList.print();
			System.out.println("-------------------------------------------------");
			
			
			String str="";
			Date date=new Date();
			str=date.toString();
			queue.enqueue(str);
			
			
			queue.push(str);
			stackList.print();
			System.out.println("");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sell(int amount, String symbol) {
		try {
			List<CompanyShares> companySharesList=objectMapper.readValue(companyShareFile,
					new TypeReference<List<CompanyShares>>() {});
			List<Customer> customersList=objectMapper.readValue(customerFile,
					new TypeReference<List<Customer>>() {});
			
			int stockPosition=StockUtility.searchSharesSymbol(symbol, companySharesList);
			System.out.println("Enter Customer Name");
			String searchName = scan.nextLine().toUpperCase();
			int customerIndex = StockUtility.searchCustomerIndex(searchName, customersList);
			String stackSymbol = "";
			CompanyShares companyShares = null;
			if (customerIndex != -1) {
				companyShares = companySharesList.get(stockPosition);
				int noOfShares = companyShares.getNoofShares();
				companyShares.setNoofShares(noOfShares + amount);

				System.out.println("");
				stackSymbol = companyShares.getStockSymbol();
				
				Customer customer = customersList.get(customerIndex);
				if (stockPosition == 0) {
					int value = customer.getAirtelShares();
					customer.setAirtelShares(value - amount);
				}
				if (stockPosition == 1) {
					int value = customer.getRelInfraShares();
					customer.setRelInfraShares(value - amount);;
				}
				if (stockPosition == 2) {
					int value = customer.getTataSteelShares();
					customer.setTataSteelShares(value - amount);;
				}
			} else {
				System.err.println("stock not found!");
			}

			objectMapper.writerWithDefaultPrettyPrinter().writeValue(companyShareFile, companySharesList);
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(customerFile, customersList);

			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company Name", "NO. of Stocks", "Price");
			System.out.println("---------------------------------------------------------------------");
			System.out.println(companySharesList.get(stockPosition).toString());

			System.out.println("\n----------Customer Details----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "AIRTEL(Shares)", "RELIANCEINFRA(Shares)",
					"TATASTEEL(Shares)");
			System.out.println("----------------------------------------------------------------------");
			System.out.println(customersList.get(customerIndex).toString());
			System.out.println("==================In LIST==================");

			System.out.println("Company Shares in LIST:");
			addToList();
			linkedlist.showList();

			System.out.println("---------------------------------------------");
			stack.push(stackSymbol);
			System.out.println("Company Symbol in STACK LIST:");
			stackList.print();
			System.out.println("-------------------------------------------");

			String str = "";
			Date currentDate = new Date();
			str = currentDate.toString();
			queue.enqueue(str);
			// System.out.println("Date in QueueList:");

			queue.push(str);

			stackList.print();
System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	//Save method
	@Override
	public void save(String filename, List<Customer> customerList) {
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), customerList);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void printReport() {
		try {
			List<CompanyShares>  companyShares=objectMapper.readValue(companyShareFile, new TypeReference<List<CompanyShares>>() {
			});
			
			List<Customer> customersList=objectMapper.readValue(customerFile,
					new TypeReference<List<Customer>>() {});
			
			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company-Name", "NO.of Stocks", "Price");
			System.out.println("-----------------------------------------------------------------");
			for (int i = 0; i < companyShares.size(); i++) {

				System.out.println(companyShares.get(i).toString());
			}

			System.out.println("\n----------Customer Details----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "AIRTEL(Shares)", "RELIANCEINFRA(Shares)",
					"TATASTEEL(Shares)");
			System.out.println("----------------------------------------------------------------------");
			for (int i = 0; i < customersList.size(); i++) {
				System.out.println(customersList.get(i).toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//method to add to linkedlist	
	public void addToList() {
		try {
			List<CompanyShares> companySharesList=objectMapper.readValue(companyShareFile,
					new TypeReference<List<CompanyShares>>() {});
			
			List<Customer> customerList=objectMapper.readValue(customerFile,
					new TypeReference<List<Customer>>() {});
			
			String string="";
			
			for (int i = 0; i < companySharesList.size(); i++) {
				string=companySharesList.get(i).toString();
				
				linkedlist.add(string);
			}
		} catch (Exception e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
			
		}
	}
	
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}

	public CompanyShares getCompanyShares() {
		return companyShares;
	}

	public void setCompanyShares(CompanyShares companyShares) {
		this.companyShares = companyShares;
	}
	
	

}
