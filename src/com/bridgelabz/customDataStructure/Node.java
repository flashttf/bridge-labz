package com.bridgelabz.customDataStructure;

public class Node<T> implements Comparable<T>{
	  
			protected T data;
			protected Node<T> next;
			
			public Node()  
			{
				 
			}
			public Node(T d)
			{
				this.data = d;
			}
			
			public T getData() 
			{
				return data;
			}
			public void setData(T data) 
			{
				this.data = data;
			}
			public Node<T> getNext() 
			{
				return next;
			}
			public void setNext(Node<T> next) 
			{
				this.next = next;
			}
			

			
//			@Override
//			public String toString() 
//			{
//				return "Node [data=" + data + ", next=" + next + "]";
//			}
			@SuppressWarnings("unchecked")
			public int compareTo(T element)
			{
				// TODO Auto-generated method stub
				return ((Comparable<T>) this.getData()).compareTo(element);
	}
}
