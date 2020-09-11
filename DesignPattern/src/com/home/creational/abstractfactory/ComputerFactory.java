package com.home.creational.abstractfactory;

public class ComputerFactory {

	private ComputerFactory() {
		
	}
	
	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
		return abstractComputerFactory.createComputer();
	}
}
