package com.bridgelabz.oops.CommercialDataProcessing;

public class Customer {
	private String name ;
	private int pawanShares;
	private int kiranShares;
	private int rahulShares;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAirtelShares() {
		return pawanShares;
	}
	
	public void setAirtelShares(int airtelShares) {
		this.pawanShares = airtelShares;
	}
	
	public int getRelInfraShares() {
		return kiranShares;
	}
	
	public void setRelInfraShares(int relInfraShares) {
		this.kiranShares = relInfraShares;
	}
	
	public int getTataSteelShares() {
		return rahulShares;
	}
	
	public void setTataSteelShares(int tataSteelShares) {
		this.rahulShares = tataSteelShares;
	}
	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-15s %-20d %-20d %-20d\n", name, pawanShares, kiranShares, rahulShares));
		
		return sb.toString();
}
}
