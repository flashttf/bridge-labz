package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.algorithms.Utility;

public class RegexDemo {
public static void main(String[] args) {
	try {
		Scanner scan=new Scanner(System.in);
		String filePath="/home/admin1/Desktop/pawan/regexmodifyFile.txt";			//file address
		
		File file=new File(filePath);												//create file for specified path
		
		BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
		
		UserDetails userDetails=new UserDetails();									//creating object of userDetails
		
		String fileString="";
		String tempString="";
		while((tempString=bufferedReader.readLine())!=null) {						//reading file content and storing in temp variable
			fileString+=tempString;	                                                                                                                                                                        												//appending temp variable data to new string variable
		}
		System.out.println(fileString);
		
		String name="";
		String lName="";
	
		do {
		System.out.println("Enter First name");						//taking user input
		name=scan.next();
		userDetails.setFirstName(name);
		}while(!name.matches("[a-zA-Z ,]+"));
		
		
//		
		
		do {
		System.out.println("Enter last name");
		name=scan.next();
		userDetails.setLastName(lName);
		}while(!name.matches("[a-zA-Z ,]+"));
		
		
		long phoneNo=0;												///phone number 			
		try {
			do {
			System.out.println("Enter Phone No");
			phoneNo=scan.nextLong();
			}while((Utility.countDigits(phoneNo)!=10));				//validating phone no digits==10
		} catch (Exception e) {
			
			System.out.println("Enter valid number");;

		}
		
		userDetails.setMobileNo(Long.toString(phoneNo));			//converting long type to string
			

		Date date=new Date();										//Date Object to 
		String dateString=DateFormat.getInstance().format(date);
//		System.out.println("Enter Date in dd/mm/yyyy format");
		userDetails.setDate(dateString);
		
		String message= editInFile(userDetails,fileString);			//replacing the user input in the fileStrring
		System.out.println(message);								//printing edited string
		
	} catch (Exception e) {
		
	}
}


/*method to	replace matching pattern with user Input. 
 * Pattern and Matcher used
 */
private static String editInFile(UserDetails userDetails, String fileString) {
	
	Pattern pattern=Pattern.compile("<<name>>");
	Matcher match=pattern.matcher(fileString);
	fileString=match.replaceAll(userDetails.getFirstName());
	
	pattern=Pattern.compile("<<full name>>");
	match=pattern.matcher(fileString);
	fileString=match.replaceAll(userDetails.getFirstName()+" "+userDetails.getLastName());
	
	pattern=Pattern.compile("xxxxxxxxxx");
	match=pattern.matcher(fileString);
	fileString=match.replaceAll(userDetails.getMobileNo());
	
	pattern=Pattern.compile("xx/xx/xxxx");
	match=pattern.matcher(fileString);
	fileString=match.replaceAll(userDetails.getDate());
			
	return fileString;
}
}
