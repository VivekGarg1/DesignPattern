package com.home.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class MessagePublisher implements Subject {

	Set<Observer> observers = new HashSet<>();

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyUpdate(Message message) {
        for (Observer observer : observers) {
			observer.updateObserver(message);
		}
	}

}
