package org.rotemj.designpatterns.structural.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OriginTargetAdapterTest {

	@Test
	void test() {
		OriginInterface orig = new OriginImpl();
		OriginTargetAdapter adapter = new OriginTargetAdapter(orig);
		System.out.println(adapter.TargetFunctionality());
	}

}
