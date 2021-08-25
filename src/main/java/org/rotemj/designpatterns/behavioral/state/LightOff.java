package org.rotemj.designpatterns.behavioral.state;

public class LightOff implements LightSwitch {

	@Override
	public LightSwitch Push() {
		System.out.println("light turned on");
		return new LightOn();
	}
	
}
