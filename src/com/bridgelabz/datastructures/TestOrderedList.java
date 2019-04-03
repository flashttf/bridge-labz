package com.bridgelabz.datastructures;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.bridgelabz.customDataStructure.OrderedListImplementation;;
public class TestOrderedList 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String path ="/home/admin1/Desktop/pawan/testorderlist.txt";
		String[] number;
		int key;
		String line ="";
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(path));
			String temp=null;
			while((temp = br.readLine())!= null)
			{
				line += temp;
			}
			number = line.split(" ");
			//create a linked list for the words
			OrderedListImplementation<Integer> list = new OrderedListImplementation<Integer>();
			for(int i = 0; i < number.length ; i++)
			{
				list.add(Integer.parseInt(number[i]));
			}
			System.out.println("Numbers list :");
			//display data of each node in the list
			list.print();
			//read the key to be searched
			System.out.println("Enter key :");
			try {
				
				key = sc.nextInt();
				boolean isKeyPresent = list.contains(key);
				if(isKeyPresent) 
				{
					System.out.printf("key '%s' is present in the list\n",key);
					list.remove(key);
				}
				else 
				{
					System.out.printf("key '%s' is not present in the list\n",key);
					list.add(key);
				}
				//display data of each node in the list
				list.print();
			}
			catch(InputMismatchException e) 
			{
				System.out.println("Key must be a number ...!");
			}
			sc.close();
			
			//write back the list to file
			list.writeToFile(list,path);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}