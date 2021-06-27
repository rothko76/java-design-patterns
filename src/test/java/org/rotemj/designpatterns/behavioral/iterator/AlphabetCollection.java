package org.rotemj.designpatterns.behavioral.iterator;
public class AlphabetCollection implements MyIterable  {
	
	private String[] letters = {"A","B", "C", "D", "E", "F", "G", "H","I", "J", "K"} ;

	@Override
	public MyIterator getIterator() {
		return new AlphabetCollectionIterator(this);
	}

	public int size() {
		return letters.length;
	}
	
	public static class AlphabetCollectionIterator implements MyIterator{
		public AlphabetCollectionIterator(AlphabetCollection collection) {
			super();
			this.collection = collection;
		}

		private int currElement = 0;
		AlphabetCollection collection;
		@Override
		public boolean hasNext() {
			return currElement < collection.letters.length;
		}

		@Override
		public Object next() {
			return collection.letters[currElement++];
		}
	}



	
}
