package org.rotemj.designpatterns.structural.bridge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BridgeTest {

	@Test
	void test() {
		Shape square = new Square(new Blue());
		assertEquals(square.draw(), "Square drawn. Color is Blue");
	}

}
