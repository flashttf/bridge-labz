package com.bridgelabz.AddressBookApplication;

import java.util.Scanner;

public class ManageAddressBook {
	
	static AddressBook addressBook=new AddressBook();
	static Scanner scan=new Scanner(System.in);
	
	public static void addNewCustomerBook() {
		String response=null;
		if(addressBook.getFile()!=null) {
			System.out.println("\nAn existing addressBook is already opened!"+"\nDo you wish to exit?\nType 'yes' or 'no'");
		response=scan.next().toLowerCase();	
		}
		
		if(addressBook.getFile()==null||response.equals("yes")) {
			addressBook.toCreateAddressBook();
		}
		else if(response.equals("no")) {
			System.out.println("\nThank You! Continue with current book");
		}
		else {
			System.out.println("\nInvalid response");
		}
	}
	
	//------------------------------------------------//
	
	public static void openExistingAddressBook() {
		String response=null;
		if(addressBook.getFile()!=null) {
			System.out.println("\nAn existing addressBook is already opened!"+"\nDo you wish to exit?\nType 'yes' or 'no'");
			response=scan.next().toLowerCase();	
			}
			
			if(addressBook.getFile()==null||response.equals("yes")) {
				addressBook.toOpenAddressBook();
			System.out.println();
			}
			else if(response.equals("no")) {
				System.out.println("\nThank You! Continue with current book"+"\n Dont forget to save changes");
			}
			else {
				System.out.println("\nInvalid response");
			}
	}
	
	//--------------------------------------------------------------//
	public static void addPersonInAddressBook() {
		if(addressBook.getFile()!=null) {
			System.out.println("Enter First Name");
			String firstName=scan.nextLine().toUpperCase();
			System.out.println("Enter Last Name");
			String lastName=scan.nextLine().toUpperCase();
			System.out.println("enter the address:");
			String address = scan.nextLine().toUpperCase();
			System.out.println("enter the city-name:");
			String cityName = scan.nextLine().toUpperCase();
			System.out.println("Enter the state-name:");
			String stateName = scan.nextLine().toUpperCase();
			System.out.println("Enter the zip-code");
			String zipCode = scan.nextLine();
			System.out.println("Enter the Phone Number");
			String phoneNo = scan.nextLine();
			
			addressBook.addPerson(firstName, lastName, address, cityName, stateName, zipCode, phoneNo);
		}
		else {
			System.out.println("\nNo Address Book linked.Create one or open existing");
		}
	}
	//----------------------------------------------------------------------------//
	
	public static void updatePersonInAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("search person by first name: ");
			String searchName = scan.nextLine().toUpperCase();
			int index = addressBook.searchPersonByFirstName(searchName);
			if (index >= 0) {
				System.out.println("enter the address:");
				String address = scan.nextLine().toUpperCase();
				System.out.println("enter the city");
				String cityName = scan.nextLine().toUpperCase();
				System.out.println("enter the State:");
				String stateName = scan.nextLine().toUpperCase();
				System.out.println("Enter the zip:");
				String zipCode = scan.nextLine();
				System.out.println("enter the phone:");
				String phoneNo = scan.nextLine();

				addressBook.toUpdatePerson(index, address, cityName, stateName, zipCode, phoneNo);
			} else {
				System.out.println("\nPerson not found!\n");
			}
		} else {
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
}
	}
	
	//--------------------------------------------------------------------//
	public static void removePersonFromAddressBook() {
		if(addressBook.getFile()!=null) {
			System.out.println("Enter Person's name to be removed");
			String searchName=scan.nextLine();
			int index=addressBook.searchPersonByFirstName(searchName);
			if(index>=0) {
				addressBook.removePerson(index);
			}else {
				System.out.println("Person not found");
			}
		}else {
				System.out.println("\nNo addressBook linked.Create one or Open existing");
			}
	}
	
	//-------------------------------------------------------//
	public static void sortAddressBookByName() {
		if(addressBook.getFile()!=null) {
			addressBook.sortByPersonName();
		}else {
			System.out.println("\nNo addressBook linked.Create one or Open existing");
		}
	}
	
	//-------------------------------------------------------------//
	public static void sortAddressBookByZip() {
		if(addressBook.getFile()!=null) {
			addressBook.sortByZip();
		}else {
			System.out.println("\nNo addressBook linked.Create one or Open existing");
		}
	}
	
	//------------------------------------------------------------------//
	public static void printAddressBook() {
		if(addressBook.getFile()!=null) {
			System.out.println("\n"+"FileName:"+addressBook.getFileName()+"\n");
			addressBook.printAll();
			System.out.println("End of this address book\n");
		}
		else {
			System.out.println("\nNo addressBook linked.Create one or Open existing");
		}
	}
	
	//---------------------------------------------------------------------//
	
	public static void saveAddressBook() {
		if(addressBook.getFile()!=null) {
			IntefaceAddress.toSaveFile(addressBook.getFile());
			System.out.println("AddressBook saved Successfully");
		}else {
			System.out.println("\nNo addressBook linked.Create one or Open existing");
		}
	}
	
	//----------------------------------------------------------------------//
	public static void saveAsAnotherAddressBook() {
		if(addressBook.getFile()!=null) {
			System.out.println("Enter FileName");
			String fileName=scan.nextLine();
			System.out.println("Enter File Extension");
			String fileExtension=scan.nextLine();
			if(fileExtension.equals(".json")||fileExtension.equals(".txt")) {
				IntefaceAddress.toSaveFile(FileSystem1.toCreateNewFile(fileName, fileExtension));
				System.out.println("AddressBook Saved to Another File succesfully");
			}else {
				System.out.println("\nNo addressBook linked.Create one or Open existing");
			}
		}
	}
}


