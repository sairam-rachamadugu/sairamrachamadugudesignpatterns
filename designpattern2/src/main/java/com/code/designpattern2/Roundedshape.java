package com.code.designpattern2;

public class Roundedshape extends Abstractfactorypattern {
	   public Shapeclass getShape(String shapeType){    
		      if(shapeType.equalsIgnoreCase("RECTANGLE")){
		         return new RoundedRectangle();         
		      }else if(shapeType.equalsIgnoreCase("SQUARE")){
		         return new RoundedSquare();
		      }	 
		      return null;
		   }
}
