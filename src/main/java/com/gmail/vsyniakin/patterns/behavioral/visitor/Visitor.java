package com.gmail.vsyniakin.patterns.behavioral.visitor;

import com.gmail.vsyniakin.patterns.behavioral.visitor.elements.Circle;
import com.gmail.vsyniakin.patterns.behavioral.visitor.elements.Triangle;

public interface Visitor {
	public void visit(Triangle triangle);
	public void visit(Circle circle);
}
