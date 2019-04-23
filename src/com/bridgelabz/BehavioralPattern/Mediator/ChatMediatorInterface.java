package com.bridgelabz.BehavioralPattern.Mediator;

/*
 * first we create the mediator interface that will define the contract for concrete mediators.
 */
public interface ChatMediatorInterface {
	public void sendMessage(String msg,User user);
	void addUser(User user);
}
