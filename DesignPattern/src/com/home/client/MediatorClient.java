package com.home.client;

import com.home.behavioral.mediator.ChattingMediator;
import com.home.behavioral.mediator.ChattingMediatorImpl;
import com.home.behavioral.mediator.User;
import com.home.behavioral.mediator.UserImpl;

public class MediatorClient {

	public static void main(String[] args) {
		
		ChattingMediator chattingMediator=new ChattingMediatorImpl();
		User user1= new UserImpl(chattingMediator, "Vivek Garg");
		User user2= new UserImpl(chattingMediator, "Prabhat Singh");
		User user3= new UserImpl(chattingMediator, "Shubham");
		User user4= new UserImpl(chattingMediator, "Paras");
		User user5= new UserImpl(chattingMediator, "Abhinav");
		
		chattingMediator.addUser(user1);
		chattingMediator.addUser(user2);
		chattingMediator.addUser(user3);
		chattingMediator.addUser(user4);
		chattingMediator.addUser(user5);
		
		user2.sendMessage("Hi,All");
	}
}
