package com.bridgelabz.DesignPatterns.Singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton objectThreadSafeSingleton;
	
	private ThreadSafeSingleton() {
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance() {		//synchronized
		if(objectThreadSafeSingleton==null) {
			objectThreadSafeSingleton=new ThreadSafeSingleton();
		}
		return objectThreadSafeSingleton;
	}
}
