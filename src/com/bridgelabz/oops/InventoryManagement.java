package com.bridgelabz.oops;

import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryManagement implements Serializable{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String filePath="/home/admin1/Desktop/pawan/Inventory.json";
		
		ObjectMapper mapper=new ObjectMapper();						//first step in creation of a  node is instantiate Object mapper
		
		File file = new File(filePath);
	
		int choice=0;
		
		try {
		
			JsonNode node=mapper.readTree(file);					
//			System.out.println(node);
			
			do {
				System.out.println("Enter Choice");
				System.out.println("Enter 1 for Rice\nEnter 2 for Pulses\nEnter 3 for Wheat");
				try {
					choice=scan.nextInt();
				} catch (Exception e) {
					System.out.println("Enter correct choice");
				}
				
			} while (choice<0||choice>4);
			
			String product="";											//variable to store product value from file.
			
			switch (choice) {
			case 1:product="Rice";
				
				break;
			case 2:product="Pulses";
			
			break;
			case 3:product="Wheat";
			break;

			default:
//				System.out.println("Please Enter correct choice");
				break;
			}
			
			
			JsonNode inventory=node.findPath(product);
			System.out.println();
			
			for(JsonNode node1:inventory) {								//for each loop over every node in tree						
				String name=node1.findPath("name").asText();
				String weight=node1.findPath("weight").asText();
				String price=node1.findPath("price").asText();
				
				System.out.println("Name of item:\t"+name+"\nWeight:\t\t"+weight+" kg\nPrice per kg:\t"+price+" rupees");
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
