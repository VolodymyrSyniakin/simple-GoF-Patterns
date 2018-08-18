package com.gmail.vsyniakin.patterns.creational.abstractfactory.factory;

import com.gmail.vsyniakin.patterns.creational.abstractfactory.flowers.Flower;
import com.gmail.vsyniakin.patterns.creational.abstractfactory.trees.Tree;

public interface AbstractFactory {
	Tree createTree();
	Flower createFlower();
}
