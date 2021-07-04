package org.rotemj.designpatterns.creational.prototype.copyctorimplementation;

public class Circle extends Shape {

	public Circle(Shape sourceObj) {
		super(sourceObj);
	}

	public Circle(String color, String texture) {
		super(color, texture);
	}

}
