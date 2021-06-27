package org.rotemj.designpatterns.creational.factory.naive;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
