package com.bridgelabz.oops.CommercialDataProcessing;

public class Stack<T> 
	{
		StackList ls=new StackList();
		Node head;
		static int top;
		static Object[] arr;
		public static int size;

		public Stack(int n)
		{
			top=-1;
			size=n;
			arr=new String[n];
		
		}
		
		
		boolean isEmpty()
		{
			return (top<0);
		}
		
		
		public class Node<T>
		{
			T data;
			T next;
			
			Node(T new_data)
			{
				data=new_data;
				next=null;
			}
		}

		
		public boolean push(T new_data)
		{
			if(top>size)
			{
				System.out.println("stack overflow");
				return false;
			}
			
			else
			{
			
				arr[++top]=ls.push(new_data);
				
				return true;
			}
		}
		
		public <T> Object pop()
		{	
			Node temp=head;
			Object s;
			if(top < 0)
			{
				System.out.println("stack underflow");
				return null;
			}
			else
			{
			  s=arr[top--];
			 System.out.print(" "+s);
			return s;
			}
		}
}
