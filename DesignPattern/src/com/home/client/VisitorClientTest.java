package com.home.client;

import com.home.behavioral.visitor.Book;
import com.home.behavioral.visitor.Fruit;
import com.home.behavioral.visitor.Item;
import com.home.behavioral.visitor.ShoppingCardVisitor;
import com.home.behavioral.visitor.ShoppingCardVisitorImpl;

public class VisitorClientTest {

	public static void main(String[] args) {
	Item[] items=new Item[]{
		new Book("Core Java", "123", 800.0),
		new Book("Core Java", "123", 400.0),
		new Book("Core Java", "123", 500.0),
		new Fruit("Apple", 3, 70.0),
		new Fruit("Pomegranate", 5, 50.0)
		};
	
	double totalCost=calculateTotalCost(items);
	System.out.println("Total Cost: "+totalCost);
 }

	private static double calculateTotalCost(Item[] items) {
		ShoppingCardVisitor shoppingCardVisitor=new ShoppingCardVisitorImpl();
		double totalCost=0.0;
		for (Item item : items) {
			totalCost+=item.accept(shoppingCardVisitor);
		}
		return totalCost;
	}
}
