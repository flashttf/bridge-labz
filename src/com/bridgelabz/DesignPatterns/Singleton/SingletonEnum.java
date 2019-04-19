package com.bridgelabz.DesignPatterns.Singleton;

public enum SingletonEnum {
	INSTANCE;
	
	public static SingletonEnum getInstance() {
		return INSTANCE;
	}
}
