package com.home.behavioral.state;

public class ACRemote {
	
	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void doAction() {
		if(state.equalsIgnoreCase("ON"))
			System.out.println("AC is turned ON");
		else if(state.equalsIgnoreCase("OFF"))
			System.out.println("AC is turned OFF");
	}

}
