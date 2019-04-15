package com.bridgelabz.AddressBookApplication;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	Scanner	scan=new Scanner(System.in);
	private List<PersonInfo> personList=new ArrayList<PersonInfo>();
	FileSystem1 fileSystem=new FileSystem1();
	static File file;
	private static String fileName;
	
	public AddressBook() {
		
	}
	
	public List<PersonInfo> getPersonList() {
		return personList;
	}

	public void setPersonList(List<PersonInfo> personList) {
		this.personList = personList;
	}

	public FileSystem1 getFileSystem() {
		return fileSystem;
	}

	public void setFileSystem(FileSystem1 fileSystem) {
		this.fileSystem = fileSystem;
	}

	public static File getFile() {
		return file;
	}

	public static void setFile(File file) {
		AddressBook.file = file;
	}

	public static String getFileName() {
		return fileName;
	}

	public static void setFileName(String fileName) {
		AddressBook.fileName = fileName;
	}
	
	/*Method to create address book in a file
	 * 1.ask for filename,fileExtension
	 * 
	 */
	public void toCreateAddressBook() {
			try {
				System.out.println("Enter FileName:");
				String fileName=scan.next();
				System.out.println("Enter fileExtension");
				String fileExtension=scan.next();
				
				if(fileExtension.equals(".json")||fileExtension.equals(".txt")) {
					File tempFile=fileSystem.toCreateNewFile(fileName.trim(), fileExtension);
					setFile(tempFile);
					setFileName(fileName+fileExtension);
					FileSystem1.setList(personList);
					System.out.println("\n New Address Book Created.\n");
				}
				else {
					System.out.println("\nPlease enter extension as [.json] or [.txt]");
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
	
	/*Method to Open Address Book
	 * 
	 * 
	 */
	public void toOpenAddressBook() {
		System.out.println("Enter FileName");
		String fileName=scan.next();
		System.out.println("Enter fileExtension");
		String fileExtension=scan.next();
		if(fileExtension.equals(".json")||fileExtension.equals(".txt")) {
			File toOpenFile=IntefaceAddress.toGetPathOfFile(fileName, fileExtension);
			IntefaceAddress.toReadFile(toOpenFile);
			setFile(toOpenFile);
			setFileName(fileName+fileExtension);
		}else {
			System.out.println("\nOnly [.json] or [.txt] files can be read");
		}
	}
	
	/*Method to add new PersonInfo to Book
	 *  
	 */
	public void addPerson(String firstName,String lastName,String address,String cityName,String stateName,String zipCode,String phoneNo) {
		PersonInfo newPersonInfo=new PersonInfo(lastName,firstName,address,cityName,stateName,zipCode,phoneNo);
		personList=FileSystem1.getList();
		personList.add(newPersonInfo);
		FileSystem1.setList(personList);
	}
	
	/*Method to get FullNAme of Person
	 *
	 */
	public void toGetFullNameOfPerson(String searchName) {
		int index=searchPersonByFirstName(searchName);
		if(index>=0) {
			System.out.println(FileSystem1.getList().get(index).getFirstName()+" "+FileSystem1.getList().get(index).getLastName());
		}else {
			System.out.println("Person Not Found");
		}
	}
	
	/*Method to search person given firstName
	 *
	 */
	public int searchPersonByFirstName(String keyFirstName) {
		// TODO Auto-generated method stub
		int index=-1;
		for(int i=0;i<FileSystem1.getList().size();i++) {
			String personFirstName=FileSystem1.getList().get(i).getFirstName();
			if(keyFirstName.equals(personFirstName)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	/*
	 * Method to update person iNfo
	 */
	public void toUpdatePerson(int index,String address,String cityName,String stateName,String zipCode,String phoneNo) {
		fileSystem.getList().get(index).getAddress();
		fileSystem.getList().get(index).getCityName();
		fileSystem.getList().get(index).getStateName();
		fileSystem.getList().get(index).getZipCode();
		fileSystem.getList().get(index).getPhoneNo();
		System.out.println("Person Info updated successfully");
	}
	
	/*
	 * Method to remove person from address book
	 */
	public void removePerson(int index) {
		fileSystem.getList().remove(index);
	}
	
	
	//Sort person by name
	public void sortByPersonName() {
		personList=fileSystem.getList();
		ZIPComparator compareByPerson=new ZIPComparator();
		Collections.sort(personList,compareByPerson);
	}
	
	//sort by zips
	public void sortByZip() {
		personList=fileSystem.getList();
		ZIPComparator zipComparator=new ZIPComparator();
		Collections.sort(personList,zipComparator);
	}
	
	public void printAll()
	{
		personList = fileSystem.getList();
		for(PersonInfo p : personList)
		{
			System.out.println(p.toString());
		} 
}
	
	//Comparator classes implementing comparator Interface.
	class ZIPComparator implements Comparator<PersonInfo>
	{

		@Override
		public int compare(PersonInfo personOne, PersonInfo personTwo) {
			
			int personOneZip = Integer.parseInt(personOne.getZipCode());
			int personTwoZip = Integer.parseInt(personTwo.getZipCode());
			if(personOneZip < personTwoZip)
			{
				return -1;
			}
			else if(personOneZip > personTwoZip)
			{
				return 1;
			}
			return 0;
			
		}
	}
	
	class NameComparator implements Comparator<PersonInfo>
	{

		@Override
		public int compare(PersonInfo personOne, PersonInfo personTwo) 
		{
			return(personOne.getFirstName().compareTo(personTwo.getFirstName()));
		}
		
	}
}
