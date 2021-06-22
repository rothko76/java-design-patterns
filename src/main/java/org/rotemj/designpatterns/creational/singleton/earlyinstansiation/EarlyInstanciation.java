package org.rotemj.designpatterns.creational.singleton.earlyinstansiation;

public class EarlyInstanciation {
private static EarlyInstanciation obj = new EarlyInstanciation(); 
	public static EarlyInstanciation getInstance() {
		return obj;
	}
	
	public void SomeLogic() {
		
	}

}
