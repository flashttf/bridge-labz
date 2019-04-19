package com.bridgelabz.oops;

import java.io.File;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import com.fasterxml.jackson.databind.cfg.MapperConfig;

public class InventoryManager {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	String filepath="/home/admin1/Desktop/pawan/Inventory.json";
	File file=new File(filepath);
	
	ObjectMapper objectMapper=new ObjectMapper();
	
	int choice=0;
	try {
		JsonNode tempJsonNode=objectMapper.readTree(file);
		
		do {
			System.out.println("Enter 1 for rice\n2 for Pulses\n3for wheat");
			choice=sc.nextInt();
		}while(choice<0||choice>4);
		
		String product="";
		
		switch (choice) {
		case 1:product="Rice";
			break;
		case 2:product="Pulses";
		break;
		case 3:product="Wheat";
		break;

		default:
			break;
		}
		
		int total=0;
		JsonNode temJsonNode1=tempJsonNode.findPath(product);
		for(JsonNode temJsonNode3:temJsonNode1) {
			String name=temJsonNode3.findPath("name").asText();
			int weight=temJsonNode3.findPath("weight").asInt();
			int price=temJsonNode3.findPath("price").asInt();
			
			total=weight*price;
			System.out.println("Name of item:\t"+name+"\nWeight:\t\t"+weight+"\nPrice:\t\t"+price);
			System.out.println("========================================");
			System.out.println("Total value of "+name+":"+total+"\n");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
