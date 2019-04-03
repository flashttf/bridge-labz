package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.customDataStructure.DequeImplementation;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String string;
		
		try {
			System.out.println("Enter the string for palindrome " );
			 string=scanner.next();
			 char[] c= string.toCharArray();
			DequeImplementation<Object> m=new DequeImplementation<Object>(c.length);	 
			for(int i=c.length-1 ; i>=0 ;i--)
			{
				m.rearenque(c[i]);	
			}
			 
//			System.out.println("\n"+"The New MyDeque array is: "+"\n"+ m);
			System.out.println("\n"+"Matching both the queue:----input String and MyDeque");	
		    	boolean status=true; //to store condition-->matched or not
		    	 
		    	  //to traverse each element of the Deque and match with Char Array{i/p string} 
		    	  
				for(int i=0 ; i<c.length ;i++)
				{
					if(c[i]!=(char) m.frontdequeue())
					{
						status=false;	
						break;
					}
					status=true;
				}
				if(status)
				{
					System.out.println("it is palindrome");
				}
				else
					System.out.println("not a palindrome");
				
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
