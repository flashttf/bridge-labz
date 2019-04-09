package com.bridgelabz.customDataStructure;

public class Stack<T> {
	final int capacity=Constants.STACKSIZE;
	

	private int size;
	
	Node<T> top=null;
	
	public Stack() {
		this.top=null;
	}
	
	public void push(T ele) {		
		Node<T> temp=new Node<T>(ele);				//passing element to be be pushed to tempNode
		temp.next=top;								//next of temp node will point to top
		top=temp;									//tempNode will be the new top	
		size++;		
	}                      
	
	public T pop() {		
		if(top==null) {		  						//if top is null.ie stack is empty						
			return null;
		}
		else {
			T ele=top.data;							//storing data of topmost node in local variable T ele.	
			top=top.next;							//top will decrement
			size--;										
			return ele; 
			
		}
		
	}
	
	public T peek() {								//peek method will return element at top of stack
		return top.data;
	}
	
	public void printStack() {						//method to print a stack
		
		Node<T> temp=top;							//temp node will point to top
		while(temp!=null) {							//traverse till temp node points to null
			System.out.print(temp.data+"->");		//	printing data
			temp=temp.next;							//update to next node
		}
		System.out.println("");
	}
	
	public int getStackCapacity() {
		return capacity;
	}
	
	public boolean isStackEmpty() {
		return size==0;
	}
	
	public int getSize() {
		return size;
	}
}
