package org.rotemj.designpatterns.creational.singleton.lazyinstansiation;

public class LazyInstantiation {
	private static LazyInstantiation instance;

	private LazyInstantiation() {
	}

	public static LazyInstantiation getInstance() {
		synchronized (LazyInstantiation.class) {
			if (instance == null) {
				instance = new LazyInstantiation();
			}
			return instance;
		}
	}

}
