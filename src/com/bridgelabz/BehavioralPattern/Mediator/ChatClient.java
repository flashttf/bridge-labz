package com.bridgelabz.BehavioralPattern.Mediator;


/* The client program is very simple and it has no idea how the message is getting handled 
 * and if the mediator is getting the message or not
 * 
 * 
 * Mediator pattern is useful when the communication logic between objects is complex,we can have central
 * point of communcation that takes care of communication logic.
 * 
 * JMS(Java message service) uses Mediator pattern along with Observer pattern to allow apps to subscribe
 * and publish data to 	other applications.
 * 
 * We should not use mediator pattern just to achieve loose-coupling because if the number of mediators will
 * grow,then it will become hard to maintain them.
 */
public class ChatClient {
public static void main(String[] args) {
	ChatMediatorInterface mediator=new ChatMediatorImpl();
	User user1= new UserImpl(mediator, "Pawan");
	User user2= new UserImpl(mediator, "Shreyas");
	User user3= new UserImpl(mediator, "Kiran");
	User user4= new UserImpl(mediator, "Roshan");
	mediator.addUser(user1);
	mediator.addUser(user2);
	mediator.addUser(user3);
	mediator.addUser(user4);
	
	user1.send("Hello BridgeITers");//one of the user is sending msg and rest will receive the msg
}
}
