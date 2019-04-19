package com.bridgelabz.DesignPatterns.Singleton;

public class StaticBlockSingleton {
	
	 /*
	  * Drawback: creates the instance even before its being used
	  */
	private static StaticBlockSingleton objectStaticBlockSingleton;
	
	private StaticBlockSingleton() {						//private constructor to restrict object creation outside this class
		
	}
	
	static {												//object creation happens in static block that provides exception handling
		try {
			objectStaticBlockSingleton=new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	 public static StaticBlockSingleton getInstance() {				//method to return the instance.only Point of global access to the object
		return objectStaticBlockSingleton;
	}
}
