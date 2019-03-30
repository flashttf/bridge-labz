package com.bridgelabz.datastructures;

public interface UnorderedListInteface<T> {
	public void add(T element);
	public void print();
	boolean contains(T element);
	boolean remove(T element);
	boolean isEmpty();
	public int size();
	void append(T item);
	void insert(int position,T item);
	void writeToFile(String fielpath);
	int index(T item);
	public T pop();
	public T pop(int pos);
	
}
