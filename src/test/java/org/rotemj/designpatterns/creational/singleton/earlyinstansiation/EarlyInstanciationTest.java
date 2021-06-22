package org.rotemj.designpatterns.creational.singleton.earlyinstansiation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.rotemj.designpatterns.creational.singleton.earlyinstansiation.EarlyInstanciation;

class EarlyInstanciationTest {

	@Test
	void test() {
		EarlyInstanciation instance1 = EarlyInstanciation.getInstance();
		EarlyInstanciation instance2 = EarlyInstanciation.getInstance();
		assertNotNull(instance1);
		assertNotNull(instance2);
		assert (instance1 == instance2);
	}

}
