package com.home.proxy;

public class VeryExpensiveProcessImpl implements VeryExpensiveProcess {

	@Override
	public void process() {
		System.out.println("Processing is done");
	}
	
	public VeryExpensiveProcessImpl() {
		heavyInitialConfigurationSetup();
	}

	private void heavyInitialConfigurationSetup() {
		System.out.println("Setting up initial configuration");
	}

}
