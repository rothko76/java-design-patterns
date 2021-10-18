package org.rotemj.designpatterns.structural.bridge;

public abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public String draw();

}
