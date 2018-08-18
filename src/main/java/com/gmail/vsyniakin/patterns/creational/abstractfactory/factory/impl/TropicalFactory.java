package com.gmail.vsyniakin.patterns.creational.abstractfactory.factory.impl;

import com.gmail.vsyniakin.patterns.creational.abstractfactory.factory.AbstractFactory;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.flowers.Flower;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.flowers.impl.Rose;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.trees.Tree;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.trees.impl.Palm;

public class TropicalFactory implements AbstractFactory {

	public Tree createTree() {
		return new Palm();
	}

	public Flower createFlower() {
		return new Rose();
	}

}
