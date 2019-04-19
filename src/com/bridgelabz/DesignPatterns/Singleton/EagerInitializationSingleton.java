/* Private Constructor to restrict the instantion of the class from other class
 * Private Static variable of the same class that is only instance	of the class.
 * public static method that returns the instance of the class,it is global accesspoint for outer world to get the instance of the singleton class.
 */

package com.bridgelabz.DesignPatterns.Singleton;



public class EagerInitializationSingleton {
	
	/*
	 * Drawback: creates the instance even before its being used
	 */
	private static final EagerInitializationSingleton instance=new EagerInitializationSingleton();	
	
	private EagerInitializationSingleton() {
		
	}
	
	public static EagerInitializationSingleton getInstance() {						//only point of global access to the object
		return instance;
	}
}
