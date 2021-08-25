package org.rotemj.designpatterns.behavioral.state;

public class Room {
	public Room() {
		super();
		lightSwitch = new LightOff();
	}

	LightSwitch lightSwitch;
	
	void pushButton() {
		lightSwitch = lightSwitch.Push();
		
	}
}
