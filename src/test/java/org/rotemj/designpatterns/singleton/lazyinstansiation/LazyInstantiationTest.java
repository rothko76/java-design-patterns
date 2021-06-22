package org.rotemj.designpatterns.singleton.lazyinstansiation;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class LazyInstantiationTest {

	@Test
	void test() {
		LazyInstantiation instance1 = LazyInstantiation.getInstance();
		LazyInstantiation instance2 = LazyInstantiation.getInstance();
		assertNotNull(instance1);
		assertNotNull(instance2);
		assert (instance1 == instance2);
	}

}
