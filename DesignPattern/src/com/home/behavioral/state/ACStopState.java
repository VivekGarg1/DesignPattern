package com.home.behavioral.state;

public class ACStopState implements State {

	@Override
	public void doAction() {
		System.out.println("AC is turned OFF");
	}
	

}
