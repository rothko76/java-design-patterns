package org.rotemj.designpatterns.creational.prototype.cloneimplementation;

public abstract class Shape implements Cloneable {
	String color;
	String texture;

	@Override
	public String toString() {
		return "Shape [color=" + color + ", texture=" + texture + "]";
	}

	public Shape clone() throws CloneNotSupportedException {
		Shape clone = null;
		clone = (Shape) super.clone();
		// TODO Auto-generated catch block
		return clone;
	}
}
