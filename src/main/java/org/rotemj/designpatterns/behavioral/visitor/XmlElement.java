package org.rotemj.designpatterns.behavioral.visitor;

public class XmlElement extends Element {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

	public XmlElement(String uuid) {
		super(uuid);
	}

}
