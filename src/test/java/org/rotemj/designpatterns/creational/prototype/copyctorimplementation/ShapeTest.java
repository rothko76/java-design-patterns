package org.rotemj.designpatterns.creational.prototype.copyctorimplementation;

import org.junit.jupiter.api.Test;
import org.rotemj.designpatterns.creational.prototype.copyctorimplementation.Circle;
import org.rotemj.designpatterns.creational.prototype.copyctorimplementation.Shape;

class ShapeTest {

	@Test
	void test() {
		Shape circle = new Circle("blue","stripes");
		System.out.println(circle.toString());
		
		Shape clonedCircle1 = circle.clone();
		System.out.println(clonedCircle1.toString());
		
		Shape clonedCircle2 = (Shape) circle.clone();
		System.out.println(clonedCircle2.toString());

		Shape clonedCircle3 = (Shape) circle.clone();
		System.out.println(clonedCircle3.toString());
	}

}
