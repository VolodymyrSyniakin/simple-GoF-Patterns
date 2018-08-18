package com.gmail.vsyniakin.patterns.behavioral.mediator;

public interface Chat {
	
	void add(User user);
	
	void sendMessageUser(String msg, User sender, User receiver);

	void sendMessageAll(String msg, User sender);
}
