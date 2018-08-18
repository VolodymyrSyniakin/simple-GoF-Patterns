package com.gmail.vsyniakin.patterns.creational.factorymethod;

import com.gmail.vsyniakin.patterns.creational.factorymethod.ext.AppleCreator;
import com.gmail.vsyniakin.patterns.creational.factorymethod.ext.BananaCreator;

public class DemoFactoryMethod {

	public static void main(String[] args) {
		Creator appleCreator = new AppleCreator();
		Creator bananaCreator = new BananaCreator();
		
		ProductFruit apple = appleCreator.factoryMethod();
		ProductFruit banana = bananaCreator.factoryMethod();

	}

}
