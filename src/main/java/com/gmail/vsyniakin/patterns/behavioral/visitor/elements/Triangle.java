package com.gmail.vsyniakin.patterns.behavioral.visitor.elements;

import com.gmail.vsyniakin.patterns.behavioral.visitor.Shape;
import com.gmail.vsyniakin.patterns.behavioral.visitor.Visitor;

public class Triangle extends Shape {
	
	private final double sideA;
	private final double sideB;
	private final double sideC;
	private double area;
	private double perimeter;
	
	
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public double getSideA() {
		return sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public double getSideC() {
		return sideC;
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

	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + ", area=" + area + ", perimeter="
				+ perimeter + "]";
	}
}
