package com.gmail.vsyniakin.patterns.creational.prototype;

public abstract class Profession implements Cloneable{
	private final String value;

	protected Profession(String value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "Profession [value=" + value + "]";
	}
}
