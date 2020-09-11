package com.home.client;

import com.home.behavioral.strategy.CreditCardPaymentMethod;
import com.home.behavioral.strategy.PaypalPaymentMethod;
import com.home.behavioral.strategy.Product;
import com.home.behavioral.strategy.ShoppingCart;

public class StrategyClientTest {

	public static void main(String[] args) {
		
		ShoppingCart shoppingCart=new ShoppingCart();
		Product product1=new Product("soap", "101", 30);
		Product product2=new Product("shampoo", "108", 100);
		Product product3=new Product("cookoies", "203", 90);
		shoppingCart.addproduct(product1);
		shoppingCart.addproduct(product2);
		shoppingCart.addproduct(product3);
		
		shoppingCart.payment(new CreditCardPaymentMethod("Vivek Garg", "123456", "123", "20/05/2021"));
		System.out.println("----------------------------");
		
		Product product4=new Product("milk", "211", 30);
		Product product5=new Product("salt", "198", 100);
		shoppingCart.addproduct(product4);
		shoppingCart.addproduct(product5);
		shoppingCart.payment(new PaypalPaymentMethod("v@gmail.com", "123"));
	}
}
