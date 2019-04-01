package com.bridgelabz.datastructures;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class UtilityDataStructures {
public static	Scanner sc=new Scanner(System.in);
	

	
	//-------------------------LinkedList-------------------------------------------------///
	//--------------------------------------------------------------------------///
	
	class container<T>{
		
	}
	
	@SuppressWarnings("rawtype")
	public class Node<T>{						//creating new a node
		T data;
		Node next;
	}
	
	
	
	//---------------------------------------------------------------------------------//
	
	@SuppressWarnings("unchecked")
	public class linkedList<T>{
		Node head;
		int size=0;
		
		@SuppressWarnings("unchecked")
		///---------------add method-------------------------------------------////
		
		public void add(T data) {
			Node node=new Node();			//creating newnode.
			node.data=data;					//value assigned to node.
			node.next=null;
			if(head==null) {				//if list is empty head points to null
				head=node;					//after adding first node heads points to first node
				size++;						//incrementing size of list.size keeps track of no of nodes in the list
			}
			else {
				Node newNode=head;
				while(newNode.next!=null) {
					newNode=newNode.next;
					
				}
				newNode.next=node;
				size++;
			}
		}
		
		
		////-----------------------------------------------///
		
		public void printList() {							//method to print list
			Node node=head;
			while(node!=null) {
				System.out.println(node.data);
				node=node.next;
			}
		}
		
		//-------------------------------------------------------------///
		
		public boolean search(T key) {						//method to search a key
			Node newNode=head;								
			while (newNode.next!=null) {					//traversing till last node
				if((newNode.data).equals(key)==true) {		//checking key with current node data
					return true;							//if key found return true
				}
				else {
					newNode=newNode.next;					//look into next node
				}
			}
			return false;
		}
		
		//--------------------------delete method-------------------------//
		public void delete(T key) {
			Node node1=head;
			Node node2=head.next;
			while(node1.next!=null) {						//traverse till end of list
				if(head.data.equals(key)) {					//checking if key present in head
					head=head.next;							//if key is found in head, then head points to next node
					size--;									//size will decrement
					break;									//stop looping if key is found
				}
				if((node2.data.equals(key)==true && node2.next==null)) {		//if key is found in the last node
					node1.next=null;											//then next field of previous node will point to null
					size--;
					break;
				}
				if((node2.data.equals(key)==true)) {
					System.out.println("deleted item is "+node2.data);
					size--;
					node1.next=node2.next;
					break;
				}
				else {
					node1=node1.next;
					node2=node2.next;
				}
			}
		}
		
		///----------------------insert method------------------------------///////////////
		public void insert(int index,T insertData) {		
			Node newNode=new Node();						
			Node node1=head;										//tempnode initialised to head
			newNode.data=insertData;								//newNode object will contain data(input) to insert
			newNode.next=null;										//newNode will point to null i.e. it is the last node			
			
			 for (int i = 0; i < index; i++)						//traversing till given index
			 {
				node1=node1.next;
			 }
			 newNode.next=node1.next;								//next field of temporary node is assigned to next of newNode
			 node1.next=newNode;									//newNode is assigned to next of tempNode			
			 size++;												//after inserting 1 node size will increase	by 1 .
			
		}
		
//		-----------------String pop---------------------////////////////////////
  	public 	String pop()										
		  {
			Node tempNode;
			tempNode=head;
			while(tempNode.next!=null)
			{
				tempNode=tempNode.next;
			}
			tempNode.next=null;
			String s1=(String)tempNode.data;
			return s1;
			  
		  }
  	
  	///-------------------------------------------------------------------------------//
  	////---------pop method by index-------------/////////////////////
  	String pop(int position)
	  {
		  Node tempNode1;										//temporary node1
			Node tempNode2;										//temporary node2		
			tempNode1=head;										//head assigned to temporary node
			tempNode2=tempNode1.next;							//tempNode2 will be next of tempNode1			
		  String poppedString;
		  if(position==1)										//if index is 1			
			{
				poppedString=head.data.toString();				//poppedString will have the data at head node
				head.next=head.next;							//head will point to next	
				
				return poppedString;									
			}
		  
		  if(position<size-1)									//if position is less than size-1
	  {
		
		for (int i = 0; i < position-1; i++) {					//traversing till position-1 of list
			tempNode1=tempNode1.next;							
			tempNode2=tempNode2.next;
		}
		poppedString=tempNode2.data.toString();					//data to be popped will be of tempnode2
		tempNode1.next=tempNode2.next;							//after popping next field of tempnode1 will point to next node of tempnode2
		return poppedString;
		}
		 return null;
	  }
  //---------------------size-keeps track of size of list---------------//////////////////	
    int size()
	 {
		 return size;
	 }
    
    //---------------------------------------------------------------------------------//
    
    //------------------------is Linkedlist empty method----------------------------//
    
    boolean isempty()
	  {
		  
		  if(size()==0)							//i.e. if head points to null.list is empty
		  {
			  return true;
		  }else
			  return false;
	  }
    //------------------------------------------------------------------------------------//
    
    
   //----------------------- to display the list----------------------------------------//
    
    public void file(String address2)						
	{
		
		 Node node=head;					//to iteration 
		 while(node!=null)
		 {
			 writeInFile((String)node.data,address2);		//sending word to file
			 node=node.next;						//to iterate next node
		 }
	} 
    
   //-----------------------Method to read a file-------------------------//////////
    
    
    public String readfile(String address)		//reads the content of file 
	 {
		 String data="";

			try {
			 FileReader fileReader=new FileReader(address);
			BufferedReader bufferedReader=new BufferedReader(fileReader); 
			String line=bufferedReader.readLine();					//to read a whole line
			while(line != null)
			{
				data+=line;
				line=bufferedReader.readLine();
			}
			bufferedReader.close();
			fileReader.close();
			}
			
			catch(Exception e)
			{
				System.out.println("exception catched in catch");
			}
		 return data;
	 }
    ///------------------------------------------------------------------------///
    
    public void writeInFile(String s,String address1)			//method to print the result to file
	 {
		
		 boolean h=true;
			try
			{
				File file=new File(address1);
			FileWriter fileWriter=new FileWriter(file,h);
					
			 BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			 
				
			
			 bufferedWriter.write(s);
			 bufferedWriter.newLine();
			 bufferedWriter.flush();
			 
			
			 bufferedWriter.close();
			 fileWriter.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	 }
    
	}
	
	linkedList llist=new linkedList();
//----------------------------------------------------------------------////	
	
	/*Stack using linked list.
	 * stack follows LIFO(Last-in-First-out)structure.
	 * 
	 * 
	 */
	
	public class Stack<T>{ 
		Node top;
		int size=0;
		
		class Node<T>{
			T data;											//data field	
			Node link;										//link field		
		}
		
		Stack(){
			this.top=null;	
		}
		
		////---push function to add an element in the stack--------///////////
		public void push(T inputData) {
			Node tempNode=new Node();						//create tempNode adn allocate memory.
			
//			if(tempNode==null) {							//checking if stack heap is full
//				System.out.println("StackOverflow. Cannot Insert");		//if full then inserting will lead to stack overflow.
//			}
//			
			tempNode.data=inputData;						//initialize inputData in tempNode data field.
			tempNode.link=top;								//put top reference into tempNode link.
			top=tempNode;									//updating top reference.
			size++;
		}
	
		/////////------method to check if stack is empty-------///////////////////
		
		public boolean isStackEmpty() {
			return top==null;
		}
		
		///-------------------Method to return topmost element in the stack----///////////////
		
		public void peek(){
			if(!isStackEmpty()) {
				System.out.println("Top most element is "+top.data);
			}
			else {
				System.out.println("Stack is empty");
			}
		}
		
		public void pop() {
			if(top==null) {														//if stack is empty cannot pop
				System.out.println("Stack underflow.Cannot pop");
			}
			else {
				top=top.link;
												//assign temp link to temp
					size--;
				}
			}
		
		
		public int size() {
			return size;
		}
	}
	
	Stack stack=new Stack();
}
