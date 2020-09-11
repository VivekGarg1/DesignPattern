package com.home.structural.decorator;

public class SportsBike extends BikeDecorator {

	public SportsBike(Bike bike) {
		super(bike);
	}
	
	@Override
	public void assembleBike() {
		super.assembleBike();
		System.out.println("Adding feature of sports bike");
	}

}
