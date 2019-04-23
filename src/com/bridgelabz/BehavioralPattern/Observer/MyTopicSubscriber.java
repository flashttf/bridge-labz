package com.bridgelabz.BehavioralPattern.Observer;

public class MyTopicSubscriber implements Observer{
	private String name;
	private InterfaceSubject topic;
	
	public MyTopicSubscriber(String nm) {
		// TODO Auto-generated constructor stub
		this.name=nm;
	}
	
	@Override	
	public void update() {
		// TODO Auto-generated method stub
		String msg=(String) topic.getUpdate(this);
		if(msg==null) {
			System.out.println(name+":: No new Message");
		}else
			System.out.println(name+"::Consuming Message"+msg);
	}
	@Override
	public void setSubject(InterfaceSubject sub) {
		// TODO Auto-generated method stub
		this.topic=sub;
	}
}
