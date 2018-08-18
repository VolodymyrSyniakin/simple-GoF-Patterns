package com.gmail.vsyniakin.patterns.creational.factorymethod.ext;

import com.gmail.vsyniakin.patterns.creational.factorymethod.Creator;
import com.gmail.vsyniakin.patterns.creational.factorymethod.ProductFruit;
import com.gmail.vsyniakin.patterns.creational.factorymethod.impl.Apple;

public class AppleCreator extends Creator{

	@Override
	public ProductFruit factoryMethod() {
		return new Apple();
	}
	
}
