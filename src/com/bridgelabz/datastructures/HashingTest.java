package com.bridgelabz.datastructures;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.bridgelabz.customDataStructure.OrderedListImplementation;
import com.bridgelabz.customDataStructure.UtilityDs;

public class HashingTest {
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		String text="/home/admin1/Desktop/pawan/hashingtest.txt";
		BufferedReader bufferedReader=new BufferedReader(new FileReader(text));
		String line=" ";
		String[] str=null;
		//Reading from a file
		while((line=bufferedReader.readLine())!=null)
		{
			str=line.split(" ");
		}
		Integer[] arr=new Integer[str.length];
		System.out.print("List in File : ");
		
		//Storing into a integer array
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		//
			arr[i]=Integer.parseInt(str[i]);
		}
		System.out.println();
		

		List<List<Integer>> arraylist =new ArrayList<List<Integer>>();
		for(int i=0;i<11;i++)
		{
			arraylist.add(new ArrayList<Integer>());
		}
 
		for (int i = 0; i < arr.length; i++) 
		{ 
			// Get if the element is present 
			Integer c = UtilityDs.hashFunction(arr[i]);

			// Insert the element 
			arraylist.get(c).add(arr[i]);
		}
		for(List<Integer> l:arraylist) 
		{
			if(!l.isEmpty()) 
			{
				System.out.println(l);
			}
		}
		System.out.println("Enter the string to search : ");
		Integer key=sc.nextInt();
		int c =UtilityDs.hashFunction(key);
		boolean s=arraylist.get(c).contains(key);
		System.out.println(s);
		if(s) 
		{
			arraylist.stream().filter(list-> list.contains(key)).findFirst().get().remove(key);
		}
		else
		{
			// Insert the element 
			//arraylist.get(c).add(key);
		}
		BufferedWriter filewritter=new BufferedWriter(new FileWriter(text));
		arraylist.stream().forEach(list-> list.forEach(t -> 
		{
			try 
			{
				filewritter.write(t.intValue()+" ");
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}) );
		filewritter.close();
		bufferedReader.close();
		sc.close();
}
}
