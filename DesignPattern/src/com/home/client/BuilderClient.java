package com.home.client;

import java.nio.FloatBuffer;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import com.home.builder.Laptop;

public class BuilderClient {
	
	public static void main(String[] args) {
		
		Laptop laptop1 = new Laptop.LaptopBuilder("10 GB", "120 GB", "4 GHZ").build();
		System.out.println("Laptop config: "+laptop1);
		
		Laptop laptop2 = new Laptop.LaptopBuilder("10 GB", "120 GB", "4 GHZ").setBluetoothEnabled(false).setGraphicsEnabled(true).build();
		System.out.println("Laptop1 config: "+laptop2);
		
		Laptop laptop3 = new Laptop.LaptopBuilder("10 GB", "120 GB", "4 GHZ").setBluetoothEnabled(true).build();
		System.out.println("Laptop1 config: "+laptop3);
		
		//Some JDK implementation examples
		Builder<String> builder = Stream.builder();
		builder.add("Vivek");
		builder.add("Garg");
		Stream<String> stream = builder.build();
		stream.forEach(System.out::println);
		
		FloatBuffer  floatBuffer = FloatBuffer.allocate(3);
		floatBuffer.put(1.0f);
		floatBuffer.put(1.1f);
		floatBuffer.put(1.2f);
		//floatBuffer.put(1.3f);//Exception in thread "main" java.nio.BufferOverflowException
		float[] array = floatBuffer.array();
		for (float f : array) {
			System.out.println(f);
		}
	}

}
