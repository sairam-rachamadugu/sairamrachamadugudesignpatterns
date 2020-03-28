package com.code.designpattern1;

public class ShapeDemo {
	   public Shapeclass getShape(String shapeType){
		      if(shapeType == null){
		         return null;
		      }		
		      if(shapeType.equalsIgnoreCase("CIRCLE")){
		         return new Circleclass();
		         
		      }
		      else if(shapeType.equalsIgnoreCase("RECTANGLE")){
		         return new Rectangleclass();
		         
		      }
		      
		      return null;
		   }

}
