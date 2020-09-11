package com.home.behavioral.visitor;

public class ShoppingCardVisitorImpl implements ShoppingCardVisitor {

	@Override
	public Double visit(Book book) {
		double cost=0.0;
		if(book.getPrice() >500)
			cost=book.getPrice()-100;
		else
			cost=book.getPrice();
		System.out.println("Book "+book.getName()+",Book Isbn"+book.getIsbnNumber()+",cost "+cost);
		return cost;
	}

	@Override
	public Double visit(Fruit fruit) {
		double cost=fruit.getPricePerKg()*fruit.getWeight();
		System.out.println("Fruit "+fruit.getName()+", cost "+cost);
		return cost;
	}

}
