package org.rotemj.designpatterns.structural.bridge;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Square drawn. " + color.fill();
	}

}
