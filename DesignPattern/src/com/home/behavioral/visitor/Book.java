package com.home.behavioral.visitor;

public class Book implements Item {

	private String name;
	private String isbnNumber;
	private double price;

	public Book(String name, String isbnNumber, double price) {
		super();
		this.name = name;
		this.isbnNumber = isbnNumber;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public Double accept(ShoppingCardVisitor visitor) {
		return visitor.visit(this);
	}

}
