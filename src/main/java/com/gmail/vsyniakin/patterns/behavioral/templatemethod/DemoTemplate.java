package com.gmail.vsyniakin.patterns.behavioral.templatemethod;

public class DemoTemplate {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		
		a.templateMethod();
		b.templateMethod();
	}

}
