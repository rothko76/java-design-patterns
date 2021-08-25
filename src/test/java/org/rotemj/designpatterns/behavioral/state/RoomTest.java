package org.rotemj.designpatterns.behavioral.state;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class RoomTest {

	@Test
	void test() {
		Room room = new Room();
		Set<String> set = new HashSet<String>();
		set.add("rot");
		room.pushButton();

		room.pushButton();

	}

}
