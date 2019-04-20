package com.bridgelabz.StructuralDesignPatterns.Adaptive;

public class Socket {
	
	public Volt getVolt() {
		return new Volt(120);
	}
}
