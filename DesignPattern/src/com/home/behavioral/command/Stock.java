package com.home.behavioral.command;

public class Stock {
	
	private String stockName="Google Share";
	private int stockQuantity=20;

	public void sellStock() {
		System.out.println("Stock name: "+stockName+",Stock quantity: "+stockQuantity+" sold");
	}

	public void buyStock() {
		System.out.println("Stock name: "+stockName+",Stock quantity: "+stockQuantity+" bought");
	}

}
