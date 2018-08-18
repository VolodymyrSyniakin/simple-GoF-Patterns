package com.gmail.vsyniakin.patterns.behavioral.mediator;

public class ModeratorUser extends User {
	
	public ModeratorUser(String name, Chat chat) {
		super("Moderator " + name, chat);
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
