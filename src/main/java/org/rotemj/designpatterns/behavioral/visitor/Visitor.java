package org.rotemj.designpatterns.behavioral.visitor;

public interface Visitor {
	public void visit(XmlElement xe);
	public void visit(JsonElement je);
}
