package com.gmail.vsyniakin.patterns.structural.composite;

import com.gmail.vsyniakin.patterns.structural.composite.shapes.Circle;
import com.gmail.vsyniakin.patterns.structural.composite.shapes.Square;

public class DemoComposite {

	public static void main(String[] args) {
			
		CompositeShapes composite = new CompositeShapes();
		
		composite.add(new Circle());
		composite.add(new Circle());
		composite.add(new Square());
		
		composite.draw();

	}

}
