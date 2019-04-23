package com.bridgelabz.BehavioralPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

/*
 * here we are creating a concrete mediator class,It will have a list of users
 * in the group and provide logic for communication between the users.
 */
public class ChatMediatorImpl implements ChatMediatorInterface{

	private List<User> users;
	
	public ChatMediatorImpl() {
		this.users=new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String msg, User user) {
		for(User u:this.users) {
			//message should not be received by the  user sending it
			if(u!=user) {
				u.receive(msg);
				
			}
		}
		
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
		
	}

}
