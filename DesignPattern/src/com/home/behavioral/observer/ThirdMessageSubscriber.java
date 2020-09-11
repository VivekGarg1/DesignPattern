package com.home.behavioral.observer;

public class ThirdMessageSubscriber implements Observer {

	@Override
	public void updateObserver(Message message) {
		System.out.println("Message for third Subscriber: "+message.getMessage());
	}

}
