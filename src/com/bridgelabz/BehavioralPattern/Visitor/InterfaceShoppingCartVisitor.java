package com.bridgelabz.BehavioralPattern.Visitor;

public interface InterfaceShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
