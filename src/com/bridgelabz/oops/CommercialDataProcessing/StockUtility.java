package com.bridgelabz.oops.CommercialDataProcessing;

import java.util.List;
import java.io.File;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockUtility {

	Scanner scan=new Scanner(System.in);
	static ObjectMapper objectMapper=new ObjectMapper();
	
	/*
	 * Method to add acount if it doesnt exist
	 * 
	 */
	
	public static void addAccount(String fileName) {
		Scanner scan=new Scanner(System.in);
		fileName="/home/admin1/Desktop/"+fileName;
		
		try {
			List<Customer> customerList = objectMapper.readValue(new File(fileName),new TypeReference<List<Customer>>() {});
			
			StockAccount stockAccount=new StockAccount();
			System.out.println("Enter Customer name");
			String customerName=scan.nextLine().toUpperCase();
			
			if(searchCustomerIndex(customerName,customerList)==-1) {
				Customer newCustomer=new Customer();
				 customerList.add(newCustomer);
				System.out.println("\n New Customer added "+customerName+"\n");
				stockAccount.save(fileName,customerList);
				
				System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "PAWAN(Shares)", "KIRAN(Shares)",
						"RAHUL(Shares)");
				System.out.println();
				System.out.println(customerList.get(searchCustomerIndex(customerName, customerList)).toString());
			}else {
				System.out.println("Customer already exist");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
	
	
	/*Method to search by symbol of company share
	 * 
	 */
	
	public static int searchSharesSymbol(String symbol,List<CompanyShares> companySharesList) {
		int count=0;
		int index=-1;
		
		for (int i = 0; i < companySharesList.size(); i++) {
			count=0;
			String companySymbol=companySharesList.get(i).getStockSymbol();
			if(symbol.compareTo(companySymbol)==0) {
				index=i;
				break;
			}
			else {
				count++;
			}
		}
		return index;
	}
	
	/*Purpose:Method to search customer by customerName(index).
	 * return:int
	 */
	public static int searchCustomerIndex(String searchName, List<Customer> customerList) {
		int count=0;
		int index=-1;
		
		for (int i = 0; i < customerList.size(); i++) {
			count=0;
			String custName=customerList.get(i).getName();		
			
			if(searchName.compareTo(custName)==0) {
				index=i;break;
			}
			else {
				count++;
			}
		}
		
		if(count!=0) {
			System.err.println("Customer not found");
		}
		return index;
	}
	
}
