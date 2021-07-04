package org.rotemj.designpatterns.creational.prototype.cloneimplementation;

public class Circle extends Shape{

	public Circle(String color, String texture) {
		super();
		this.color = color;
		this.texture = texture;
		System.out.println("creating circle");
		for (int i = 0; i < 3; i++) {
			System.out.print(".");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\nfinished creating circle");
	}

}
