package com.home.client;

import com.home.structural.bridge.Blue;
import com.home.structural.bridge.Rectangle;
import com.home.structural.bridge.Red;
import com.home.structural.bridge.Shape;
import com.home.structural.bridge.Square;

public class BridgeClientTest {

	public static void main(String[] args) {
		
		Shape square=new Square(new Blue());
		String blueSquare = square.draw();
		System.out.println(blueSquare);
		
		System.out.println("-------------------");
		
		Shape rectangle=new Rectangle(new Red());
		String redRectangle = rectangle.draw();
		System.out.println(redRectangle);
		
	}
}
