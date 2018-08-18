package com.gmail.vsyniakin.patterns.behavioral.templatemethod;

public abstract class AbstractClass {
	public final void templateMethod() {
		differencesCode();
		System.out.println("templateMethod() - the same code for all children");
	}
	
	public abstract void differencesCode ();
}
