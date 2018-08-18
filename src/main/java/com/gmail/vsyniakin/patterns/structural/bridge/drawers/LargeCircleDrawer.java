package com.gmail.vsyniakin.patterns.structural.bridge.drawers;

import com.gmail.vsyniakin.patterns.structural.bridge.Drawer;

public class LargeCircleDrawer implements Drawer {

	private static final int radius = 10;
	
	public void draw() {
		System.out.println("Draw circle - size " + radius);
	}

	public static int getRadius() {
		return radius;
	}
	
	

}
