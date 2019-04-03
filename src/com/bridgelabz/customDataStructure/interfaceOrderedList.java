package com.bridgelabz.customDataStructure;

public interface interfaceOrderedList<T> 
{
	public void add(T ele);
	public void print();
	public boolean contains(T ele);
	public boolean remove(T ele);
	public boolean isEmpty();
	public int size();
	public T pop(int pos);
	public T pop();
	int index(T item);
	public void writeToFile(OrderedListImplementation<T> list, String filePath);
}