package com.home.behavioral.visitor;

public interface Item {

	public Double accept(ShoppingCardVisitor visitor);
}
