package com.bridgelabz.BehavioralPattern.Visitor;

public class Book implements InterfaceItemElement {
	private int price;
	private String isbnNumber;
	
	public Book(int cost, String isbn){
		this.price=cost;
		this.isbnNumber=isbn;
	}
	
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(InterfaceShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
