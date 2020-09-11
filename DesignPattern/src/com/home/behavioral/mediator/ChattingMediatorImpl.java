package com.home.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChattingMediatorImpl implements ChattingMediator {
	
	private List<User> userList;

	public ChattingMediatorImpl() {
		super();
		userList = new ArrayList<User>();
	}

	@Override
	public void sendmessage(String message, User user) {
		for (User userData : userList) {
			if(!userData.getUserName().equalsIgnoreCase(user.getUserName()))
				userData.receiveMessage(message);
		}
	}

	@Override
	public void addUser(User user) {
		userList.add(user);
	}

}
