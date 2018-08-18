package com.gmail.vsyniakin.patterns.behavioral.mediator;

public class DemoMediator {

	public static void main(String[] args) {
		Chat chat = new ChatMediator();
		
		User userOne = new SimpleUser("Johnny", chat);
		User userTwo = new SimpleUser("Depp", chat);
		User moderator = new ModeratorUser("Pirate", chat);
		
		chat.add(userOne);
		chat.add(userTwo);
		chat.add(moderator);
		
		userOne.writeMessageToAll("Who is the moderator?");
		moderator.writeMessageToUser("I'm, do you have a problem?", userOne);
		userOne.writeMessageToUser("No no no", moderator);
		
		
	}

}
