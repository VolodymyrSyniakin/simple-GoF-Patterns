package com.gmail.vsyniakin.patterns.creational.singleton;

public class Singletone {

	private static Singletone instance;

	private Singletone() {
		super();
	}

	public static Singletone getInstance() {
		if (instance == null) {
			instance = new Singletone();
		}
		return instance;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
