package com.bridgelabz.AddressBookApplication;

import java.util.Scanner;

public class TasksToPerform {
	static ManageAddressBook addressBook = new ManageAddressBook();// to implement all the methods 
	public static void addressMenu(boolean value)
	{
	Scanner sc=new Scanner(System.in);
	try {
		while(value)
		{
			System.out.println("Enter the choice:");
			System.out.println("1. Create New Address Book");
			System.out.println("2. Open existing Address Book");
			System.out.println("3. Add Person in Address Book");
			System.out.println("4. Edit PersonInformation in Address Book");
			System.out.println("5. Remove Person from addressBook");
			System.out.println("6. Sort entries by person's name");
			System.out.println("7. Sort entries by zip code");
			System.out.println("8. Print entries present in the address-book");
			System.out.println("9. Save Address Book");
			System.out.println("10.Save As Address Book");
			System.out.println("11.Quit Program");
			
			int n=sc.nextInt();
			switch(n)
			{
				case 1:	ManageAddressBook.addNewCustomerBook();
						break;
						
				case 2: ManageAddressBook.openExistingAddressBook();						
						break;
					
				case 3: ManageAddressBook.addPersonInAddressBook();
						break;
						
				case 4:	ManageAddressBook.updatePersonInAddressBook();
						break;						
						
				case 5: ManageAddressBook.removePersonFromAddressBook();
						break;
					
				case 6:	ManageAddressBook.sortAddressBookByName();
						break;
						
				case 7:	ManageAddressBook.sortAddressBookByZip();
						break;
					
				case 8: ManageAddressBook.printAddressBook();
						break;
					
				case 9: ManageAddressBook.saveAddressBook();
						break;
						
				case 10: ManageAddressBook.saveAsAnotherAddressBook();		
						break;
						
				case 11: System.out.println("\nApplication stopped!\n"); 
						value = false;
						break;
						
						
				default: System.out.println("invalid choice... try again");
						
			}	
		}	
	}
	catch(NullPointerException e)
	{
		System.out.println("\nNo AddressBook opened currently!");
	}
	
}
}
