package com.bridgelabz.BehavioralPattern.Visitor;

/*
 * The benefit of this pattern is that if th logic of operation changes,then we need to make
 * change	only in the visitor implementation rather than doint it in all classes.
 *
 * Another benefit is that adding a new item to the system is easy,It will require  change only in 
 * visitor interface and implementation and existing item classes will not be affected.
 * 
 * The drawback of visitor pattern is that we should know the return type of visit() methods at the
 * time of designing else we will have to change the interface and all of its implementations.
 * Another drawback is that there are too many implementations of visitor interface.
 * It makes it hard to extend.
 */

public class ShoppingCartClient {
	public static void main(String[] args) {
		InterfaceItemElement[] items=new InterfaceItemElement[] {new Book(20,"1234"),new Book(100,"5678"),
					new Fruit(10,2,"Banana"),new Fruit(5,5,"Apple")};
		
		int total=calculatePrice(items);
		System.out.println("Total Cost= "+total);
}

	private static int calculatePrice(InterfaceItemElement[] items) {
	InterfaceShoppingCartVisitor visitor=new ShoppingCartVisitorImpl();
	int sum=0;
	for(InterfaceItemElement item:items) {
		sum=sum+item.accept(visitor);
	}
		return sum;
	}
}
