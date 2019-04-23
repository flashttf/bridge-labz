package com.bridgelabz.BehavioralPattern.Mediator;

/*	user can send /receive messages, so we can have user interface or abstract class.
 */
public abstract class User {
	protected ChatMediatorInterface mediator;
	protected String name;
	
	public User(ChatMediatorInterface med,String name) {
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
