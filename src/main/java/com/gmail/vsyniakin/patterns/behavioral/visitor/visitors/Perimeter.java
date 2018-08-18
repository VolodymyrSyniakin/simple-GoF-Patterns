package com.gmail.vsyniakin.patterns.behavioral.visitor.visitors;

import com.gmail.vsyniakin.patterns.behavioral.visitor.Visitor;
import com.gmail.vsyniakin.patterns.behavioral.visitor.elements.Circle;
import com.gmail.vsyniakin.patterns.behavioral.visitor.elements.Triangle;

public class Perimeter implements Visitor {

	public void visit(Triangle triangle) {
		double p = triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
		triangle.setPerimeter(p);
	}

	public void visit(Circle circle) {
		circle.setPerimeter(2 * Math.PI * circle.getR());
	}
	
}
