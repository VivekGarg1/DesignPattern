package com.home.behavioral.visitor;

public interface ShoppingCardVisitor {

	public Double visit(Book book);
	public Double visit(Fruit fruit);
}
