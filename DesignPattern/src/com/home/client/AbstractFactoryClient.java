package com.home.client;

import com.home.abstractfactory.PCFactory;
import com.home.abstractfactory.ServerFactory;
import com.home.abstractfactory.Computer;
import com.home.abstractfactory.ComputerFactory;
import com.home.abstractfactory.LaptopFactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("16 GB", "120 GB", "2.23 GHZ", true, false));
		System.out.println("PC config: "+pc);
		
		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("20 GB", "128 GB", "4 GHZ", true, true));
		System.out.println("Laptop config: "+laptop);
		
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "120 GB", "8 GHZ", false, false));
		System.out.println("Server config: "+server);
		
		
	}
}
