package com.gmail.vsyniakin.patterns.structural.decorator;

import com.gmail.vsyniakin.patterns.structural.decorator.components.Component;
import com.gmail.vsyniakin.patterns.structural.decorator.components.impl.ComponentOne;
import com.gmail.vsyniakin.patterns.structural.decorator.components.impl.ComponentTwo;
import com.gmail.vsyniakin.patterns.structural.decorator.decorators.ext.DecoratorComma;
import com.gmail.vsyniakin.patterns.structural.decorator.decorators.ext.DecoratorNextLine;

public class DemoDecorator {

	public static void main(String[] args) {
		Component componentOne = new DecoratorNextLine(new DecoratorComma(new ComponentOne()));
		Component componentTwo = new DecoratorComma(new ComponentTwo());
		
		componentOne.someMethod();
		componentTwo.someMethod();
		
		
	}

}
