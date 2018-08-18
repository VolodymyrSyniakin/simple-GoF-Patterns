package com.gmail.vsyniakin.patterns.creational.prototype.prototypes;

import com.gmail.vsyniakin.patterns.creational.prototype.Profession;

public class Mechanic extends Profession{

	public Mechanic(String value) {
		super(value);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Mechanic copy = (Mechanic) super.clone();
		return copy;
	}
	
}
