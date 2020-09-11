package com.home.structural.decorator;

public class BikeDecorator implements Bike {
	
	private Bike bike;

	public BikeDecorator(Bike bike) {
		super();
		this.bike=bike;
	}

	@Override
	public void assembleBike() {
		bike.assembleBike();
	}

}
