package com.bridgelabz.datastructures;




import java.util.Scanner;





public class UnOrderedListTest {
	
@SuppressWarnings("unchecked")
public static void main(String[] args)
{	
	Scanner scan=new Scanner(System.in);
	boolean check;
	
	String address1="/home/admin1/Desktop/UnorderedList.txt";			//address to create a file
	 String address2="/home/admin1/Desktop/unorderedlistop.txt";
	UtilityDataStructures utility=new UtilityDataStructures();			//object to invoke linkedlist object

	String data=utility.llist.readfile(address1);						//method to read data from file
	data=data.trim();													//removing the empty spaces
	String[] input=data.split(" ");										//splitting the string into  words
	for (int i = 0; i < input.length; i++) {
		utility.llist.add(input[i]);									//adding words to linked list
	}
		utility.llist.printList();										//displaying linked list
		System.out.println("enter the key to search");
		String key=scan.nextLine();										//requesting for a word
		check=utility.llist.search(key);								//method to check wethwe the word is present or not
		
		if(check==true)
		{
		utility.llist.delete(key);										//if it present it must be deleted
			
		}
		else
		{
		utility.llist.add(key);											//if it not exist it must be added
		}
		
		utility.llist.printList();						         		//displaying the final result
		scan.close();
		utility.llist.file(address2);
		
}

}

