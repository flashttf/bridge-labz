package com.bridgelabz.datastructures;
import com.bridgelabz.customDataStructure.UtilityDs;
import com.bridgelabz.customDataStructure.UnorderedListImplementation;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestUnorderedList {
	public static void main(String[] args) {

		String[] words;
		String key;
		String line= "";
		String path="/home/admin1/Desktop/pawan/testunorder1.txt";
		
		Scanner sc=new Scanner(System.in);
		
		try {

			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader( new FileReader(path));//pasing filepath object to bufferR object
			String temp = null;
			while((temp = br.readLine())!= null)
			{
				line=line+temp;
			}
			words = line.split(" ");
			
			//create a linked list for the words
			UnorderedListImplementation<String> list = new UnorderedListImplementation<String>();
			for(int i = 0; i < words.length ; i++)
			{
				list.add(words[i]);
			}
			list.print();
			
			//read the key to be searched
			do
			{
				System.out.println("Enter the key...!");
				key = UtilityDs.getString();
			}
			while(key.trim().equals("") || key == null);

			boolean isKeyPresent = list.contains(key);
			if(isKeyPresent)
			{
				System.out.printf("\nkey '%s' is present in the list\n",key);
				list.remove(key);
			}	
			else
			{
				System.out.printf("\nkey '%s' is not present in the list\n",key);
				list.add(key);
			}
			
			//display data of each node in the list
			list.print();
			list.writeToFile(list, path);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		sc.close();
	}
}
