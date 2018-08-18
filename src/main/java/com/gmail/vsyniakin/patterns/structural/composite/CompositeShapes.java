package com.gmail.vsyniakin.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeShapes implements Shape {
	private List<Shape> childsShape = new ArrayList<Shape>();
	
	public void add (Shape shape) {
		this.childsShape.add(shape);
	}
	public void remove (Shape shape) {
		this.childsShape.remove(shape);
	}
	public void draw() {
		for (Shape shape : childsShape) {
			shape.draw();
		}
	}
	public List<Shape> getChildsShape() {
		return childsShape;
	}
	public void setChildsShape(List<Shape> childsShape) {
		this.childsShape = childsShape;
	}
	
}
