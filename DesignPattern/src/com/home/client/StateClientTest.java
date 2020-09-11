package com.home.client;

import com.home.behavioral.state.ACContext;
import com.home.behavioral.state.ACRemote;
import com.home.behavioral.state.ACStartState;
import com.home.behavioral.state.ACStopState;
import com.home.behavioral.state.State;

public class StateClientTest {

	public static void main(String[] args) {
		
		ACRemote acRemote=new ACRemote();
		acRemote.setState("ON");
		acRemote.doAction();
		
		System.out.println("----------------");
		
		acRemote.setState("OFF");
		acRemote.doAction();
		
		System.out.println("----------------");
		
		//Use dynamic approach
		
		ACContext context=new ACContext();
		State startState=new ACStartState();
		context.setState(startState);
		context.doAction();
		
		System.out.println("----------------");
		
		State stopState=new ACStopState();
		context.setState(stopState);
		context.doAction();
	}
}
