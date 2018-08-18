package com.gmail.vsyniakin.patterns.behavioral.visitor.elements;

import com.gmail.vsyniakin.patterns.behavioral.visitor.Shape;
import com.gmail.vsyniakin.patterns.behavioral.visitor.Visitor;

public class Circle extends Shape {
	
	private final double r;
	private double area;
	private double perimeter;
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	public double getR() {
		return r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", area=" + area + ", perimeter=" + perimeter + "]";
	}

}
