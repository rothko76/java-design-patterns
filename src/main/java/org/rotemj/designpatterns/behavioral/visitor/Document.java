package org.rotemj.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {
	public Document(String uuid) {
		super(uuid);
	}

	List<Element> elements = new ArrayList<>();

	@Override
	public void accept(Visitor v) {
		for (Element e : elements) {
			e.accept(v);
		}
	}

}
