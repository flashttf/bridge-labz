package com.bridgelabz.BehavioralPattern.Observer;

public interface Observer {
	
	//method to use the observer,used by the subject
	public void update();
	
	//attach with  subject to observe
	public void setSubject(InterfaceSubject sub);
}
