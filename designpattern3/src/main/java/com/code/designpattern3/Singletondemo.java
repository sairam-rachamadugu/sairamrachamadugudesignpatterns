package com.code.designpattern3;

public class Singletondemo {
	
	public static void main (String[] args) {
	      
	      Singleton obj = Singleton.getInstance();
	      obj.show();
	   }

	private static Singletondemo getInstance() {
		
		return null;
		
	}

}
