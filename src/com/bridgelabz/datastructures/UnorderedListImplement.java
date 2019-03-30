package com.bridgelabz.datastructures;

public class UnorderedListImplement<T> implements UnorderedListInteface<T> {
	private Node<T> first;
	private Node<T> last;
	private int size;
	
	
@Override
public void add(T element) {					//adding a node.
	Node<T> node=new Node<T>(element);
	
	if((first==null)&&(last==null))				//if linkedlist is empty then first nad last is null.
	{
		first=last=node;						//if above is true then node is assigned to first and last.
	}
	else
	{
		last.next=node;							//if list not empty then next of lastnode refers to new newly added node
		last=node;								// if list is not empty,node is assigned to last  and next of last
	}
	size++;
 }

@Override
public void print() {
	Node<T> temporaryNode=first;							//initiating temporary node with first node
	
	if(first!=null) {										//if linkedlist is not empty
		do {
			System.out.print(temporaryNode.data+" ");		
			temporaryNode=temporaryNode.next;
		}while(temporaryNode!=first);						//keep printing the node till we reach first node.
	}System.out.println("");
 }

@Override
public boolean contains(T element) {
	Node<T> temporaryNode=first;
	
	while(temporaryNode!=null) {						//keep traversing till last		
		if(temporaryNode.equals(element)) 
			return true;
		
			temporaryNode=temporaryNode.next;
		
	}
	return false;
 }

@Override
public boolean remove(T element) {
	
	Node<T> temporaryNode=first;
	Node<T> previousNode=null;
	
	while(first!=null) {
		if(temporaryNode.data.equals(element)) {
			if(previousNode==null) {
				first=temporaryNode.next;
			}
			else {
				previousNode.next=temporaryNode.next;
				temporaryNode.next=null;
			}
			size--;
			return true;
		}
		else {
			previousNode=temporaryNode;
			temporaryNode=temporaryNode.next;
			
		}
	}
	return false;
}

@Override
public boolean isEmpty() {
	
	return (size==0	);
}

@Override
public int size() {
	
	return size;
}

@Override
public void append(T item) {
	
	if(isEmpty()) {
			first=new Node<T>(item);
	}
	else if(contains(item)) {
		System.out.println(item+" already exists in the list");
	}
	else {
		Node<T> newNode= new Node<T>(item);
		last.setNext(newNode);
		last=newNode;
	}
	
}

@Override
public void insert(int position, T item) {
	Node<T> previousNode=first;
	Node<T> currentNode=first;
	
	Node<T>	newNode=new Node<>();
	
	int count=-1;
	
}

@Override
public void writeToFile(String fielpath) {
	
	
}

@Override
public int index(T item) {
	
	return 0;
}

@Override
public T pop() {
	
	return null;
}

@Override
public T pop(int pos) {
	
	return null;
}
}
