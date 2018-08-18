package com.gmail.vsyniakin.patterns.structural.flyweight;

public class DemoFlyweight {

	public static void main(String[] args) {
		Circle circle = (Circle) CirclesFactory.getCircle("green");
		
		circle.setCircleData(14, 12, 15);
		
		circle.draw();

	}

}
