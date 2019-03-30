package com.bridgelabz.datastructures;

public interface OrderedListInterface<T> {
	public void add(T element);
	public void print();
	public boolean contains(T element);
	public boolean remove(T element);
	public boolean isEmpty();
	public int size();
	public T pop(int pos);
	public T pop();
	int index(T item);
	public void writeToFile(String filepath);
}
