package com.home.client;

import com.home.structural.decorator.BasicBike;
import com.home.structural.decorator.Bike;
import com.home.structural.decorator.LuxuryBike;
import com.home.structural.decorator.SportsBike;

public class DecoratorClientTest {

	public static void main(String[] args) {
		
		Bike basicBike=new BasicBike();
		basicBike.assembleBike();
		System.out.println("-------------------------");
		
		Bike sportsBike=new SportsBike(new BasicBike());
		sportsBike.assembleBike();
		System.out.println("-------------------------");
		
		Bike luxuryBike=new LuxuryBike(new BasicBike());
		luxuryBike.assembleBike();
		System.out.println("-------------------------");
		
		Bike luxurySportsBike=new SportsBike(new LuxuryBike(new BasicBike()));
		luxurySportsBike.assembleBike();
		System.out.println("-------------------------");
	}
}
