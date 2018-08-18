package com.gmail.vsyniakin.patterns.behavioral.state;

public class User {
	private String name;
	private State state;
	private String view;
	
	public User(String name, State state) {
		super();
		this.name = name;
		this.state = state;
	}
	
	public void view () {
		state.view(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getName() {
		return name;
	}

	public State getState() {
		return state;
	}
	
	
}
