package com.home.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> productList;

	public ShoppingCart() {
		productList=new ArrayList<Product>();
	}
	
	public void addproduct(Product product) {
		productList.add(product);
	}
	
	public void removeproduct(Product product) {
		productList.remove(product);
	}
	
	private int calculateTotalPrice() {
		return productList.stream().map(p->p.getPrice()).reduce(0, Integer::sum);
	}
	
	public void payment(PaymentMethod paymentMethod) {
		paymentMethod.pay(calculateTotalPrice());
	}
}
