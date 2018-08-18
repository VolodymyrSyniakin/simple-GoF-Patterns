package com.gmail.vsyniakin.patterns.creational.prototype.prototypes;

import com.gmail.vsyniakin.patterns.creational.prototype.Profession;

public class Manager extends Profession{
	
	public Manager(String value) {
		super(value);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Manager copy = (Manager) super.clone();
		return copy;
	}

	

}
