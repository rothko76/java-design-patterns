package org.rotemj.designpatterns.singleton.enumimplementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonEnumTest {

	@Test
	void test() {
		SingletonEnum instance1 = SingletonEnum.INSTANCE;
		SingletonEnum instance2 = SingletonEnum.INSTANCE;
		assertEquals(instance1,instance2);
	}

}
