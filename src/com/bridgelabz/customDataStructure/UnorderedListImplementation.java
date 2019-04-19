package com.bridgelabz.customDataStructure;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UnorderedListImplementation<T> implements interfaceUnorderedList<T>{
	private Node<T> first;
	private Node<T> last;
	private int size;


		@Override
		public void add(T ele) 
		{
			Node<T> temp = new Node<T>(ele);
		
			if((first == null ) &&(last == null))		//if list is empty
			{
				first = last = temp;						//temp node will become the first and last
		
			}
			else										//if list is not empty
			{
				last.next=temp;							//next of last will refer to temp node
				last = temp;							//newly added node will be the last node.
			}
			size++;
		}
		@Override
		public void print() 
		{
			System.out.println("Printing the contents :");
			Node<T> temp = first;
			while(temp!=null)
			{
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println("");
		}
		@Override
		public boolean contains(T ele) 				//method to check if elem is present in list
		{
			Node<T> temp = first;					//initialzie tempNode with first.
			while(temp!= null)						//to traverse till temp not null							
			{
				if(temp.data.equals(ele))			//if data in tempnode matches given element
					return true;					//element is present in list	
		
				temp = temp.next;					//else next node will be the new tempNode.
		
			}
			return false;							//false if element is not present
		}

		@Override
		public boolean remove(T ele)				
		{
			Node<T> temp = first,prev=null;					//initialize tempnode with first and prevnode with null
			while(first!= null)								//while list not empty.
			{
				if(temp.data.equals(ele))					//check data in temp node is equal to data in current node
				{
					if(prev == null)						//deleting headnode.
					{
						first = temp.next;					///first will refer to next of tempnode
		
					}
					else
					{
						prev.next = temp.next;				//next of prevNode will refer to next of temp node
						temp.next = null;					// change next field of tempNode to null
					}
					size--;										//decrement size
					return true;
				}
				else
				{
					prev = temp;							
					temp = temp.next;
				}
			}
			return false;
		}

		@Override
		public int size() 
		{
			return size;
		}
		
		@Override
		public boolean isEmpty()
		{
			return (size==0);
		}

		@Override
		public void append(T item) 						
		{	
			if(isEmpty())									//if list is empty add item to list
			{
				first = new Node<T>(item);
			}
			else if (contains(item))						//else check if item is already present in list
				System.out.println("item "+item+" already exist in the list");
		
			else
			{											
				Node<T> newNode = new Node<T>(item);		//else store item in temp node
				last.setNext(newNode);						//next of last will reger to to tempNode
				last = newNode;								//tempNode added will be the last node
			}
		}

		@Override
		public void insert(int pos, T item) 
		{
			Node<T>	prev = first;
			Node<T> curr = first;
			Node<T> newNode = new Node<>(item);
		
			int  count = -1;
			while(curr != null)
			{
				count++;
				if(count == pos && count == 0)// insertion at 0th position, update first
				{
					newNode.setNext(curr);
					first = newNode;
					break;
				}
				else if(count == pos)
				{
					newNode.setNext(curr);
					prev.setNext(newNode);
					break;
				}
				prev = curr;
				curr = curr.getNext();
			}
			if(curr == null && pos == count+1)
				if(curr == null && pos == count +1)//insertion after the last, update last
				{
					prev.setNext(newNode);
					last = newNode;
				}
				else 
					System.out.println("Given position is not found in the lsit...!");
		}

		//remove and return the last item in the list
		public T pop() 
		{
			if(isEmpty())
			{
				System.out.println("List is empty...!");
				return null;
			}
			if(first == last) {							//remove the only item in the list
				first = last = null;
				return first.getData();
			}
			Node<T> curr = first;
			Node<T> prev = first;
			while(curr.getNext() != null) {				//traverse to reach the last item in the list
				prev = curr;
				curr = curr.getNext();
			}
			
			//remove the curr item which is the last item in the list
			last = prev;
			last.setNext(null);
			return curr.getData();
		}
		
		public T pop(int pos)
		{
			if(isEmpty())									//if list is empty
			{
				System.out.println("List is empty...!");
				return null;
			}
			Node<T> curr = first;							//inititalizze curr to first
			Node<T> prev = first;							//initialize prev to first
		
			int  count = -1;								//to delete at given index do pos-1.
			while(curr != null) 							
			{
				//traverse to reach the last item in the list
				count++;
				if(count == pos && count == 0)
				{
					first = curr.getNext();
					curr.setNext(null);
					return curr.getData();
				}
				else if(count == pos && curr == last) 
				{
					// removal at the last position
					last = prev;
					last.setNext(null);
					return curr.getData();
				}
				else if(count == pos)
				{
					//removal in-between
					prev.setNext(curr.getNext());
					curr.setNext(null);
					return curr.getData();
				}
				prev = curr;
				curr = curr.getNext();
			}
			System.out.println("Given position is not found in the lsit...!");
			return null;
		}

		@Override
		public void writeToFile(UnorderedListImplementation<T> list, String filePath) 
		{
			if(list == null)
				return;
		
			Node<T> curr = first;
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,false)))
			{
				while(curr != null) 
				{
					bw.write(curr.getData().toString()+" ");
					curr = curr.getNext();
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}

		@Override
		public int index(T item) 
		{
			if(isEmpty())
			{
				System.out.println("List is empty...!");
				return -1;//error case
			}
			Node<T> curr = first;
			int  count = -1;
			while(curr != null) 
			{
				count++;
				if(curr.getData() == item)
		            return  count;
			}
			System.out.println(item + "not found in the list...!");
			return -1;
		}
}
