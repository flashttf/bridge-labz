package com.bridgelabz.oops.CommercialDataProcessing;

public class Customer {
	private String name ;
	private int airtelShares;
	private int relianceInfraShares;
	private int tataSteelShares;

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
		return airtelShares;
	}
	
	public void setAirtelShares(int airtelShares) {
		this.airtelShares = airtelShares;
	}
	
	public int getRelInfraShares() {
		return relianceInfraShares;
	}
	
	public void setRelInfraShares(int relInfraShares) {
		this.relianceInfraShares = relInfraShares;
	}
	
	public int getTataSteelShares() {
		return tataSteelShares;
	}
	
	public void setTataSteelShares(int tataSteelShares) {
		this.tataSteelShares = tataSteelShares;
	}
	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-15s %-20d %-20d %-20d\n", name, airtelShares, relianceInfraShares, tataSteelShares));
		
		return sb.toString();
	}
}
