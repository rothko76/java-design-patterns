package org.rotemj.designpatterns.singleton.lazyinstansiation;

public class LazyInstanciation {
	private static LazyInstanciation instance;
	private LazyInstanciation() {}

	LazyInstanciation getInstance() {
		synchronized (LazyInstanciation.class) {
			if (instance == null) {
				instance = new LazyInstanciation();
			}
			return instance;
		}
	}

}
