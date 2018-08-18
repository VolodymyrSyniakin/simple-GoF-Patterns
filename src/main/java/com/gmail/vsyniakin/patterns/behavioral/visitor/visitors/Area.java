package com.gmail.vsyniakin.patterns.behavioral.visitor.visitors;

import com.gmail.vsyniakin.patterns.behavioral.visitor.Visitor;
import com.gmail.vsyniakin.patterns.behavioral.visitor.elements.Circle;
import com.gmail.vsyniakin.patterns.behavioral.visitor.elements.Triangle;

public class Area implements Visitor {

	public void visit(Triangle triangle) {
		double p = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC())/2;
		double area = p * (p - triangle.getSideA()) * (p - triangle.getSideB()) * (p - triangle.getSideC()); 
		triangle.setArea(area);
	}

	public void visit(Circle circle) {
		circle.setArea(Math.pow(circle.getR(), 2) * Math.PI);
	}

}
