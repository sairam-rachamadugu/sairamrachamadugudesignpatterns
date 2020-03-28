package com.code.designpattern2;

public class Abstractfactorydemo {

	public static void main(String[] args) {
	     Abstractfactorypattern shapeFactory = Producerclass.getFactory(false);
	      Shapeclass shape1 = shapeFactory.getShape("RECTANGLE");
	      shape1.draw();
	      Shapeclass shape2 = shapeFactory.getShape("SQUARE");
	      shape2.draw();
	      Abstractfactorypattern shapeFactory1 = Producerclass.getFactory(true);
	      Shapeclass shape3 = shapeFactory1.getShape("RECTANGLE");
	      shape3.draw();
	      Shapeclass shape4 = shapeFactory1.getShape("SQUARE");
	      shape4.draw();
	      

	}

}
