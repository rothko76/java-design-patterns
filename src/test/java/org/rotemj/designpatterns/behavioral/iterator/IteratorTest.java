package org.rotemj.designpatterns.behavioral.iterator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IteratorTest {

	@Test
	void test() {
		int iterations = 0;
		AlphabetCollection coll = new AlphabetCollection();
		MyIterator iter = coll.getIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
			iterations++;
		}
		
		assertEquals(iterations, coll.size());
	}

}
