package com.bridgelabz.json;

import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryManagement implements Serializable{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String filePath="/home/admin1/Desktop/pawan/Inventory.json";
		
		ObjectMapper mapper=new ObjectMapper();
		
		File file = new File(filePath);
	
		int choice=0;
		
		try {
		
			JsonNode node=mapper.readTree(file);
//			System.out.println(node);
			
			do {
				System.out.println("Enter Choice");
				System.out.println("Enter 1 for Rice\nEnter 2 for Pulses\nEnter 3 for Wheat");
				
				choice=scan.nextInt();
			} while (choice>0||choice<4);
			
			String result="";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
