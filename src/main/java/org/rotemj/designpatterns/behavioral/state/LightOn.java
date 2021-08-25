package org.rotemj.designpatterns.behavioral.state;

public class LightOn implements LightSwitch {

	@Override
	public LightSwitch Push() {
		System.out.println("light turned off");
		return new LightOff();
	}

}
