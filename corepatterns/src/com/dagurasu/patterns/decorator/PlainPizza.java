package com.dagurasu.patterns.decorator;

public class PlainPizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Baking Plain pizza");
	}
}
