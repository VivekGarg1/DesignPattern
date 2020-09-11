package com.home.behavioral.command;

public class SellOrder implements Order {
	
	private Stock stock;

	public SellOrder(Stock stock) {
		super();
		this.stock = stock;
	}

	public void execute() {
		stock.sellStock();
	}

}
