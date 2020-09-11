package com.home.behavioral.mediator;

public class UserImpl extends User {

	private ChattingMediator chattingMediator;
	private String userName;
	
	public UserImpl(ChattingMediator chattingMediator, String userName) {
		super(chattingMediator, userName);
		this.chattingMediator=chattingMediator;
		this.userName=userName;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(userName+" sending message= "+message);
		chattingMediator.sendmessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(userName+" recieved message= "+message);
	}

}
