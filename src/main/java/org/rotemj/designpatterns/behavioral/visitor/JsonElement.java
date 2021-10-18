package org.rotemj.designpatterns.behavioral.visitor;

public class JsonElement extends Element {

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

	public JsonElement(String uuid) {
		super(uuid);
	}

}
