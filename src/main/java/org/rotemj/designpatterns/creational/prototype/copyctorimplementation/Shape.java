package org.rotemj.designpatterns.creational.prototype.copyctorimplementation;

public class Shape {
	@Override
	public String toString() {
		return "Shape [color=" + color + ", texture=" + texture + "]";
	}

	String color;
	String texture;
	
	public Shape(Shape sourceObj) {
		this.color = sourceObj.color;
		this.texture = sourceObj.texture;
	}
	
	public Shape(String color, String texture) {
		this.color = color;
		this.texture = texture;
		
	}
	
	public Shape clone() {
		return new Shape(this);
	}
}
