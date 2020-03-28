package com.code.designpattern2;

public class Producerclass {
	   public static Abstractfactorypattern getFactory(boolean rounded){   
		      if(rounded){
		         return new Roundedshape();         
		      }else{
		         return new Shapefactory();
		      }
		   }

}
