package com.gmail.vsyniakin.patterns.creational.prototype;

import com.gmail.vsyniakin.patterns.creational.prototype.prototypes.Manager;
import com.gmail.vsyniakin.patterns.creational.prototype.prototypes.Mechanic;

public class DemoPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Manager prototypeOne = new Manager("Manager");
		Mechanic prototypeTwo = new Mechanic("Mechanic");
		
		Manager copyOne = (Manager) prototypeOne.clone();
		Mechanic copyTwo = (Mechanic) prototypeTwo.clone();
		
		System.out.println(copyOne.toString());
		System.out.println(copyTwo.toString());
		
	}
}
