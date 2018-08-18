package com.gmail.vsyniakin.patterns.behavioral.visitor;

import com.gmail.vsyniakin.patterns.behavioral.visitor.elements.Circle;
import com.gmail.vsyniakin.patterns.behavioral.visitor.elements.Triangle;
import com.gmail.vsyniakin.patterns.behavioral.visitor.visitors.Area;
import com.gmail.vsyniakin.patterns.behavioral.visitor.visitors.Perimeter;

public class DemoVisitor {

	public static void main(String[] args) {
		
		Visitor perimeter = new Perimeter();
		Visitor area = new Area();
			
		Circle circle = new Circle(10);
		Triangle triangle = new Triangle(5, 3, 4);
		
		System.out.println(circle.toString() + '\n' + triangle.toString() + '\n');
		
		circle.accept(perimeter);
		circle.accept(area);
		triangle.accept(perimeter);
		triangle.accept(area);
		
		System.out.println(circle.toString() + '\n' + triangle.toString() + '\n');
		
	}
}
