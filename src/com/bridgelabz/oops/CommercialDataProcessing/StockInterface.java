package com.bridgelabz.oops.CommercialDataProcessing;

import java.util.List;

public interface StockInterface {
	
	public double valueOf();
	public void buy(int amount,String symbol);
	public void sell(int amount,String symbol);
	public void save(String filename,List<Customer> customerList);
	public void printReport();
	
}
