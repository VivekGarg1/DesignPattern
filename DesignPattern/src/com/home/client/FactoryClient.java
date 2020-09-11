package com.home.client;

import com.home.creational.factory.Computer;
import com.home.creational.factory.ComputerFactory;
import com.home.creational.factory.ComputerType;

public class FactoryClient {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "16 GB", "120 GB", "2.23 GHZ", true, false);
		System.out.println("PC config: "+pc);
		
		Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "20 GB", "128 GB", "4 GHZ", true, true);
		System.out.println("Laptop config: "+laptop);
		
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "16 GB", "120 GB", "8 GHZ", false, false);
		System.out.println("Server config: "+server);
	}
}
