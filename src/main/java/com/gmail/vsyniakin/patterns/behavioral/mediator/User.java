package com.gmail.vsyniakin.patterns.behavioral.mediator;

public abstract class User {
	protected String name;
	protected Chat chat;
	
	protected User(String name, Chat chat) {
		super();
		this.name = name;
		this.chat = chat;
	}

	public abstract void writeMessageToUser (String msg, User user);
	public abstract void writeMessageToAll (String msg);

	public String getName() {
		return name;
	}

}
