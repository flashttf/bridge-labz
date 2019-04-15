package com.bridgelabz.oops.CommercialDataProcessing;

public class CompanyShares {
	private String companyName;
	private String stockSymbol;
	private int noOfShares;
	private int price;
	private String dateTime;
	
	
	//getters and setters
	//for company name
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	//for stocksymbol
	public String getStockSymbol() {
		return stockSymbol;
	}
	
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	
	//for no of shares
	public int getNoofShares() {
		return noOfShares;
	}
	
	public void setNoofShares(int noofShares) {
		this.noOfShares = noofShares;
	}
	
	//for share price
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//for date and time
	public String getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(String dateTime) {
		dateTime = java.util.Calendar.getInstance().getTime().toString();
		this.dateTime = dateTime;
	}
	
	
	public String toString() {
		StringBuilder stringbuffer = new StringBuilder();
		stringbuffer.append(String.format("%-15s %-20d %-20d \n", companyName, noOfShares, price));

		return stringbuffer.toString();
	}

}
