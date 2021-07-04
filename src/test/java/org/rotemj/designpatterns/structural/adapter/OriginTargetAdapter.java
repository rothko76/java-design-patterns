package org.rotemj.designpatterns.structural.adapter;

public class OriginTargetAdapter implements TargetInterface {
	public OriginTargetAdapter(OriginInterface origin) {
		super();
		this.origin = origin;
	}

	OriginInterface origin;

	@Override
	public String TargetFunctionality() {
		return origin.originFunctionality();
	}

}
