package com.bridgelabz.DesignPatterns.Singleton;

import java.io.Serializable;
/*
 * In distributed Systems, sometimes we need to implement Serializable interface
 * so that we can store its state in the file system and retrieve it at a later point of time.
 * 
 */
public class SerializedSingleton implements Serializable{
	
	
	private static final long serialVersionUID=7866545566687822722l;
	
	private SerializedSingleton() {					//constructor
		
	}
	
	//creating object of Parent class
	private static class SingletonHelperClass{
		private static final SerializedSingleton instance=new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelperClass.instance;
	}
	
}
