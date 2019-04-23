package com.bridgelabz.BehavioralPattern.Visitor;

import com.fasterxml.jackson.core.sym.Name;

public class Fruit implements InterfaceItemElement{

	private int pricePerKg;
	private int weight;
	private String name;
	
	public Fruit(int pricekg,int wt,String nm) {
		this.pricePerKg=pricekg;
		this.weight=wt;
		this.name=nm;
	}
	
	 public int getPricePerKg() {
		return pricePerKg;
	}
	 
	 public int getWeight() {
		return weight;
	}
	 
	 public String getName() {
		return name;
	}
	
	@Override
	public int accept(InterfaceShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
}
