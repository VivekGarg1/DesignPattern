package com.home.client;

import com.home.behavioral.command.BuyOrder;
import com.home.behavioral.command.SellOrder;
import com.home.behavioral.command.Stock;
import com.home.behavioral.command.StockBrocker;

public class CommandClient {

	public static void main(String[] args) {
		
		Stock stock=new Stock();
		BuyOrder buyOrder=new BuyOrder(stock);
		SellOrder sellOrder=new SellOrder(stock);
		
		StockBrocker stockBrocker=new StockBrocker();
		stockBrocker.placeOrder(buyOrder);
		stockBrocker.placeOrder(sellOrder);
		
		stockBrocker.executeOrders();
		
	}
}
