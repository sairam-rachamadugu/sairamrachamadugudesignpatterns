package com.code.designpattern2;

public class Shapefactory extends Abstractfactorypattern {

	@Override
	Shapeclass getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }	 
	      
		return null;
	}

}
