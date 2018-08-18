package com.gmail.vsyniakin.patterns.creational.abstractfactory.factory.impl;

import com.gmail.vsyniakin.patterns.creational.abstractfactory.factory.AbstractFactory;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.flowers.Flower;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.flowers.impl.Dandelion;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.trees.Tree;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.trees.impl.Oak;

public class ContinentalFactory implements AbstractFactory{

	public Tree createTree() {
		return new Oak();
	}

	public Flower createFlower() {
		return new Dandelion();
	}

	
	
}
