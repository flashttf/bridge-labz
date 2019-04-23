package com.bridgelabz.BehavioralPattern.Observer;

public interface InterfaceSubject {
	//Method to register/unregister observers
	
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	//method to notify observers of change
	public void notifyObservers();
	
	//method to get updates from observers
	public Object getUpdate(Observer obj);
}
