package org.rotemj.designpatterns.creational.factory.naive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeFactoryTest {

	@Test
	void testNull() {
		assertNull(ShapeFactory.getShape(null));
	}

	@Test
	void testNoShape() {
		assertNull(ShapeFactory.getShape("hexagon"));
	}

	@Test
	void testCircle() {
		assert(ShapeFactory.getShape("circle") instanceof Circle);
	}

	@Test
	void testRectangle() {
		assert(ShapeFactory.getShape("rectangle") instanceof Rectangle);
	}

	@Test
	void testSquare() {
		assert(ShapeFactory.getShape("square") instanceof Square);
	}

}
