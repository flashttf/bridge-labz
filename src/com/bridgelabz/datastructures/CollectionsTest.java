package com.bridgelabz.datastructures;

import java.util.LinkedList;

public class CollectionsTest {
 public static void main(String[] args) {
	LinkedList<Integer> llist=new LinkedList<Integer>();
	llist.add(25);
	llist.add(37);
	llist.add(50);
	System.out.println(llist);
	llist.remove(0);
	System.out.println(llist);
}
}
