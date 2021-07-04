package org.rotemj.designpatterns.creational.prototype.cloneimplementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.rotemj.designpatterns.creational.prototype.cloneimplementation.Circle;
import org.rotemj.designpatterns.creational.prototype.cloneimplementation.Shape;

class ShapeTest {

	@Test
	void test() throws CloneNotSupportedException {
		Shape circle = new Circle("red","dotted");
		System.out.println(circle.toString());
		
		Shape clonedCircle1 = (Shape) circle.clone();
		System.out.println(clonedCircle1.toString());
		
		Shape clonedCircle2 = (Shape) circle.clone();
		System.out.println(clonedCircle2.toString());

		Shape clonedCircle3 = (Shape) circle.clone();
		System.out.println(clonedCircle3.toString());
}

}
