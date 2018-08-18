package com.gmail.vsyniakin.patterns.structural.decorator.decorators.ext;

import com.gmail.vsyniakin.patterns.structural.decorator.components.Component;
import com.gmail.vsyniakin.patterns.structural.decorator.decorators.Decorator;

public class DecoratorComma extends Decorator {

	public DecoratorComma(Component component) {
		super(component);
	}

	@Override
	public void someMethod() {
		super.someMethod();
	}

	@Override
	public void afterMethod() {
		System.out.println(", <-- add comma");

	}
	
	

}
