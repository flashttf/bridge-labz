package com.bridgelabz.customDataStructure;

public class QueueForAnagram<T> {
	
	Node front;
	
	Node rear;
	
	
		
		@SuppressWarnings("unchecked")
		public void enque(int data)  
		{
			
			@SuppressWarnings("rawtypes")
			Node node=new Node();
			node.data = data;
			node.next = null;
			
				//if the LIST is empty  then insert node
				if(front==null)
				{
					 front=node;
					 rear =node;
					 
					 node.next= null;	
					 					    
					 					
				}
				else
				{   
				//here i.e rear++
					rear.next = node;  		//joining the rear--pointed ele  with
												//to the new node
					     rear = node;  		//then change rear, point the rear to the node 
					
				    node.next = null;  		//now point the new node.next to NULL
				}
		}		
		
		@SuppressWarnings({ "unused", "rawtypes" })
		public int deque()
		{
			int z=0;								// variable to store dequed data.
			
			Node temp;
			
			if(front==null)
			{
				System.out.println("Queue underflow");
			}
			else
			{
				 z=(int) front.data;
				 
				 front=front.next;
				
			}
			return z;
		}
		

		@SuppressWarnings("rawtypes")
		public void show()
		{
			Node temp;
			
			temp= front;
			
				if(front== null)
				{
					 System.out.println("QUeue is empty");
				}
				else
				{
					System.out.println("printing the elements of Queue");
					while(temp!= null)
					{
						System.out.print(temp.data+" ");
						temp =temp.next;
					}
				}
} 
}
