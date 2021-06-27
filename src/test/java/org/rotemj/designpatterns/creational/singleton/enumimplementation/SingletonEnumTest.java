package org.rotemj.designpatterns.creational.singleton.enumimplementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.rotemj.designpatterns.creational.singleton.enumimplementation.SingletonEnum;

class SingletonEnumTest {

	@Test
	void test() {
		SingletonEnum instance1 = SingletonEnum.INSTANCE;
		SingletonEnum instance2 = SingletonEnum.INSTANCE;
		assertNotNull(instance1);
		assertNotNull(instance2);
		assert(instance1 == instance2);
	}

}
