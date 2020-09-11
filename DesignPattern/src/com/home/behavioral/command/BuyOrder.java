package com.home.behavioral.command;

public class BuyOrder implements Order {
	
	private Stock stock;

	public BuyOrder(Stock stock) {
		super();
		this.stock = stock;
	}

	public void execute() {
		stock.buyStock();
	}

}
