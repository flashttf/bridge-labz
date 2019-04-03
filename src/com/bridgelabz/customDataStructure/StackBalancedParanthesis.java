package com.bridgelabz.customDataStructure;
/*Purpose:Implementation of stack using  its common operations.
 * @author:Pawan
 * 
 */
public class StackBalancedParanthesis<T> {
	int capacity=20;							//initiatilizing capacity of stack array.
	Object[] stack=new Object[capacity];		//Array for storing values in stack with size same as capacity
	
	private int top=0;							//top is for checking index value of each object
	
	/*
	 * Push method. elements to be pushed in the stack
	 * @param data-> the item which needs to be pushed
	 */
	
	public void push(T data) {
		if(top==capacity) {
			expand();
		}
		
		stack[top]=data;
		top++;
	}
	
	/*
	 * function to pop.(to remove and return the topmost element in the stack)
	 * @return return the topmost element or else returns null if stack is empty
	 */
	
	public T pop() {
		if(isStackEmpty()) {
			System.err.println("Cannot pop,Stack is empty");
			return null;
		}
		else {
			T data=(T)stack[--top];
			stack[top]=null;
			return data;
		}
	}
	
	/*peek method only returns the last element pushed in the stack
	 * 
	 * 
	 */
	public T peek() {
		return (T) stack[top];
	}
	

	/*Function to check if stack is empty or not 
	 * 		
	 * @return returns true if stack is empty else false
	 */

	private boolean isStackEmpty() {
		// TODO Auto-generated method stub
		return top == 0;
	}
	
	/*
	 * size method returns the size of the array
	 * 
	 */
	public int size() 
	{
		return top;
	}
	
	/*function to expand stack if stack capacity is reached
	 * 
	 */
	private void expand() {
			Object[] newStack=new Object[capacity*2];
			System.arraycopy(stack,0,newStack,0,top);
			capacity *=2;
			stack=newStack;
	}
	
	
	/*Method to give elements in the stack as string.
	 * 
	 * 
	 */
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("{");
		for(int i=0;i<top;i++) {
			sb.append(stack[i]);
			sb.append(", ");
		}
		sb.append("}");
		return sb.toString();
	}
}
