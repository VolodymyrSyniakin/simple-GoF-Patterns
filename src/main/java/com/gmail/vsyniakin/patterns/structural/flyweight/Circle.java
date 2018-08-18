package com.gmail.vsyniakin.patterns.structural.flyweight;

public class Circle implements Shape {
	
	private int x;
	private int y;
	private int r;
	private String color;
	
	public Circle(String color) {
		super();
		this.color = color;
	}

	public void draw() {
		System.out.println("Circle draw(). X: " + x + " Y: " + y + " radius: " + r + " color: " + color);

	}

	public void setCircleData(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.r = radius;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
