package com.gmail.vsyniakin.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Chat {

	List<User> users = new ArrayList<User>();

	public void add(User user) {
		users.add(user);
	}

	public void sendMessageUser(String msg, User sender, User receiver) {
		for (User user : users) {
			if (user.equals(receiver)){
				System.out.println(sender.getName() + " send message to " + receiver.getName() + ": " + msg);
			}
		}
		
	}

	public void sendMessageAll(String msg, User sender) {
		for (User user : users) {
			System.out.println(sender.getName() + " send message: " + msg);
		}
	}
	
}
