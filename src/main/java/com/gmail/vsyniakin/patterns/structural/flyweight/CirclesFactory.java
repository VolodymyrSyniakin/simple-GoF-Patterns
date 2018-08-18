package com.gmail.vsyniakin.patterns.structural.flyweight;

import java.util.HashMap;

public class CirclesFactory {
	private static final HashMap<String, Shape> circles = new HashMap<String, Shape>();
	
	public static Shape getCircle (String color) {
		if (!circles.containsKey(color)) {
			circles.put(color, new Circle(color));
		}
		return circles.get(color);
	}
	
}
