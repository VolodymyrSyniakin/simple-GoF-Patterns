package com.gmail.vsyniakin.patterns.creational.abstractfactory;

import com.gmail.vsyniakin.patterns.creational.abstractfactory.factory.AbstractFactory;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.factory.impl.TropicalFactory;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.trees.Tree;

public class DemoAbsractFactory {

	public static void main(String[] args) {
		
		AbstractFactory tropic = new TropicalFactory();
		
		Tree palm = tropic.createTree(); 

	}

}
