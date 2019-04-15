package com.bridgelabz.oops;

public class LinkedList<T> {
	@SuppressWarnings("rawtypes")
	Node head;
	
	@SuppressWarnings("rawtypes")
	public class Node<T>{
		T data;
		Node next;
	}
	
	
	public void add(T data) {			//method to add item at the end of the list
		Node new_node=new Node();		//create a tempnode
		new_node.data=data;
		
		if(head==null) {				//if head is empty new node will be the head node
			head=new_node;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new_node;
			
		}
	}
	
	
	public void showList() {					//method to printlist
		
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public boolean contains(T element) {		//method to check if element is present in the list or not
		
		Node temp=head;
		
		while(temp.next!=null) {
			if(temp.data.equals(element)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	
	public void delete(T element) {				//method to delete a node with given data
		Node currNode=head;
		Node prevNode=null;
		
		if(currNode.data==element) {			//checking if element is at head node
			head=head.next;						//if element at head node, next node will be the new head node	
		}
		while(currNode.next!=null) {
			if(currNode.data.equals(element)) {
				prevNode.next=currNode.next; 
			}
			prevNode=currNode;
			currNode=currNode.next;
		}
	}
	
	public void addFirst(T data) {				//method to add element at the start
		Node new_node=new Node();
		new_node.data=data;
		new_node.next=head;
		head=new_node;
	}
	
	public <T>T getLast(){						//method to retrive item in last node
		Node temp=head;
		while(temp.next==null) {
			temp=temp.next;
		}
		return (T) temp.data;
	}
}
