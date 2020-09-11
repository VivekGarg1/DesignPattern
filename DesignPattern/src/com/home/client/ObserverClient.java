package com.home.client;

import com.home.behavioral.observer.FirstMessageSubscriber;
import com.home.behavioral.observer.Message;
import com.home.behavioral.observer.MessagePublisher;
import com.home.behavioral.observer.SecondMessageSubscriber;
import com.home.behavioral.observer.ThirdMessageSubscriber;

public class ObserverClient {

	public static void main(String[] args) {
		
		FirstMessageSubscriber firstMessageSubscriber=new FirstMessageSubscriber();
		SecondMessageSubscriber secondMessageSubscriber=new SecondMessageSubscriber();
		ThirdMessageSubscriber thirdMessageSubscriber=new ThirdMessageSubscriber();
		
		MessagePublisher messagePublisher=new MessagePublisher();
		messagePublisher.register(firstMessageSubscriber);
		messagePublisher.register(secondMessageSubscriber);
		
		messagePublisher.notifyUpdate(new Message("This is first Message"));
		System.out.println("--------------------------------------------------");
		
		messagePublisher.unRegister(firstMessageSubscriber);
		messagePublisher.register(thirdMessageSubscriber);
		messagePublisher.notifyUpdate(new Message("This is second Message"));
	}
}
