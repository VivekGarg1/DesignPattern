package com.home.structural.decorator;

public class LuxuryBike extends BikeDecorator {

	public LuxuryBike(Bike bike) {
		super(bike);
	}
	
	@Override
	public void assembleBike() {
		super.assembleBike();
		System.out.println("Adding feature of luxury bike");
	}

}
