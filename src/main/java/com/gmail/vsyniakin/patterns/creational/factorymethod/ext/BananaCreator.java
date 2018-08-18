package com.gmail.vsyniakin.patterns.creational.factorymethod.ext;

import com.gmail.vsyniakin.patterns.creational.factorymethod.Creator;
import com.gmail.vsyniakin.patterns.creational.factorymethod.ProductFruit;
import com.gmail.vsyniakin.patterns.creational.factorymethod.impl.Banana;

public class BananaCreator extends Creator {

	@Override
	public ProductFruit factoryMethod() {
		return new Banana();
	}
	
}
