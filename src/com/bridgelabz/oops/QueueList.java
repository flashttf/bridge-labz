package com.bridgelabz.oops;

public class QueueList<T> {
	Node front,rear;
	
	public QueueList() {
		this.front=this.rear=null;
	}
	
	
	class Node<T>{
		T data;
		Node next;
		
	public	Node(T data){
			this.data=data;
			this.next=null;
		}
	}
	
	
	public void enqueue(T data) {
		Node new_node=new Node(data);
		
		if(rear==null) {
			front=rear=new_node;
			return; 
		}
		rear.next=new_node;
		rear=new_node;	
	}
	
	public String dequeu() {
		
		if(front==null) 
			return  null;
		
		Node temp=front;
		front=front.next;
		
		
		if(front==null)
			rear=null;
		return temp.data.toString();
	}
}

