package com.bridgelabz.AddressBookApplication;

import java.util.Comparator;

public class CompareAddressBook {
	public static class NameComparator implements Comparator<PersonInfo>
	{

		
		public int compare(PersonInfo personOne, PersonInfo personTwo) 
		{
			return(personOne.getFirstName().compareTo(personTwo.getFirstName()));
		}
		
	}
	
	
	public static class ZIPComparator implements Comparator<PersonInfo>
	{

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
}
