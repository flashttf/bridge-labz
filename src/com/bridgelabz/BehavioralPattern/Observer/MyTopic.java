package com.bridgelabz.BehavioralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements InterfaceSubject{
	
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX=new Object();
	
	 public MyTopic() {
		// TODO Auto-generated constructor stub
		this.observers=new ArrayList<Observer>();
	}
	
	

	@Override
	public void register(Observer obj) {
		// TODO Auto-generated method stub
		if(obj==null)
			throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if(!observers.contains(obj))
				observers.add(obj);
		}
		
	}

	@Override
	public void unregister(Observer obj) {
		// TODO Auto-generated method stub
		synchronized (MUTEX) {
			observers.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		List<Observer> observersLocal=null;
		//synchronization is used to makae sure any observer registered after message is received is  not notified
		synchronized (MUTEX) {
			if(!changed)
				return;
			observersLocal=new ArrayList<Observer>(this.observers);
			this.changed=false;
		}
		for(Observer obj:observersLocal) {
			obj.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	//method to post message to the  topic
	public void postMessage(String msg) {
		System.out.println("Message posted"+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}

}
