package com.bridgelabz.customDataStructure;

import java.util.Arrays;

public class DequeImplementation<T> {
	int size;								//size of deque
	Object object[];
	int front,rear=-1;
	
	public DequeImplementation(int size) {
		this.size=size;
		
		object=new Object[size];
	}
	
	/*
	 * Method to add element form front end
	 * @para object;
	 * @return object;
	 */
	
	public void frontenque(Object obj) {
		if(!isDeQueEmpty()) {
		
			
		}
		
		if(front-1>=0) {					//as array index starts from zero 
			object[front-1]=0;
			front--;
			
		}
		
	}

	/*
	 * Method to remove from front end	
	 * @return object .
	 */
	
	public Object frontdequeue() 				//remove element from front 
	{   
		if(front==-1)
		{
			System.out.println("Queue is underflow ");
		} 
		
	    Object e= object[front];
	    
	    front++;
		  return e;
}
	
	
	public	boolean rearenque(Object obj) {
		
		if(rear==size-1) {
			System.out.println("Queue overflow");
			return false;
		}
		object[++rear]=obj;
		return true;
	}
	
	
	
	public Object reardeque() {							//method to deque from rear
		
		if(rear==-1) {									//if queue is empty cannnot remove
			System.out.println("Queue is underflow");
		}
		else {
			Object obj=object[rear];					//else save item in rear in new object
			rear--;										//decrement rear	
		}
		
		return object;
	}
	
	boolean isDeQueEmpty() {
		if(front==-1 && rear==-1) {
			return true;
		}
		else
		return false;
	}
}
