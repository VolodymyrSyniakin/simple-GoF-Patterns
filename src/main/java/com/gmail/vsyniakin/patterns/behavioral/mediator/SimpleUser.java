package com.gmail.vsyniakin.patterns.behavioral.mediator;

public class SimpleUser extends User {
	
	public SimpleUser(String name, Chat chat) {
		super(name, chat);
	}

	@Override
	public void writeMessageToUser(String msg, User user) {
		chat.sendMessageUser(msg, this, user);
		
	}

	@Override
	public void writeMessageToAll(String msg) {
		chat.sendMessageAll(msg, this);
		
	}

	
	
}
