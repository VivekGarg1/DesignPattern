package com.home.behavioral.observer;

public interface Subject {

	public void register(Observer observer);
	public void unRegister(Observer observer);
	public void notifyUpdate(Message message);
}
