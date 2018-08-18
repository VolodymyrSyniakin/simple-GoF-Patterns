package com.gmail.vsyniakin.patterns.structural.decorator.decorators;

import com.gmail.vsyniakin.patterns.structural.decorator.components.Component;

public abstract class Decorator implements Component {
	
	protected Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}

	public void someMethod() {
		component.someMethod();
		afterMethod();
	}
	
	public abstract void afterMethod();
	
}
