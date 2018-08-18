package com.gmail.vsyniakin.patterns.behavioral.state;

import com.gmail.vsyniakin.patterns.behavioral.state.states.Busy;
import com.gmail.vsyniakin.patterns.behavioral.state.states.Free;
import com.gmail.vsyniakin.patterns.behavioral.state.states.Online;

public class DemoState {

	public static void main(String[] args) {
		State free = new Free();
		State busy = new Busy();
		State online = new Online();
		
		User context = new User("IronMen", online);
		
		context.view();
		context.setState(busy);
		context.view();
		context.setState(free);
		context.view();
	}

}
