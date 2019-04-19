package com.bridgelabz.DesignPatterns.Singleton;

public class LazyInitializationSingleton {
	
	/*Works Fine in case of single-threaded Environment.
	 * Can cause issues if multiple threads are inside the if condition
	 * Doing so will destroy the singleton pattern and get different instances of the singleton class.
	 */
	private static LazyInitializationSingleton  objectLazyInitializationSingleton;
	
	private LazyInitializationSingleton() {								//private constructor
		
	}
	
	public static LazyInitializationSingleton getInstance() {
		if(objectLazyInitializationSingleton==null) {								//lazy initialization
			objectLazyInitializationSingleton=new LazyInitializationSingleton();
		}
		return objectLazyInitializationSingleton;
	}
}
