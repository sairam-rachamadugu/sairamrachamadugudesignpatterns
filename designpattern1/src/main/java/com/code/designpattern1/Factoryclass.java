package com.code.designpattern1;

public class Factoryclass {

	public static void main(String[] args) {
	      ShapeDemo sd = new ShapeDemo();
	      Shapeclass shape1 = sd.getShape("CIRCLE");
	      shape1.draw();
	      Shapeclass shape2 = sd.getShape("RECTANGLE");
	      shape2.draw();

	}

}
