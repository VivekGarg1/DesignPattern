package com.home.behavioral.mediator;

public interface ChattingMediator {

	public abstract void sendmessage(String message,User user);
	public abstract void addUser(User user);
	
}
