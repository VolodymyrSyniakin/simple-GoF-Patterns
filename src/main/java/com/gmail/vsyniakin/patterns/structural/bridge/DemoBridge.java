package com.gmail.vsyniakin.patterns.structural.bridge;

import com.gmail.vsyniakin.patterns.structural.bridge.drawers.SmallCircleDrawer;
import com.gmail.vsyniakin.patterns.structural.bridge.shapes.Circle;

public class DemoBridge {

	public static void main(String[] args) {
		Shape smallCircle = new Circle(new SmallCircleDrawer());
		
		smallCircle.drawer.draw();

	}

}
