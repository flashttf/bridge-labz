package com.bridgelabz.oops;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReport {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	//input file address
	String inputFilePath="/home/admin1/Desktop/pawan/stockexchange.json";	
	
	//output file address
	String outputFilePath="/home/admin1/Desktop/pawan/stockexchangeop.json";
	
	//object inputfile    
	File inputFile=new File(inputFilePath);	
	
	//object outputfile
	File oututFile=new File(outputFilePath);										
	
	//ObjectMapper object to point at the rootNode of tree
	ObjectMapper mapper=new ObjectMapper();											
	ArrayList al_stock=new ArrayList();
	
	//variable to store
	int value_eachStock=0;															
	int total_value=0;
	
	try {
		                                           
		JsonNode node=mapper.readTree(inputFile);
		JsonNode rootNode=node.findPath("stock");
		
		for(JsonNode tempNode:rootNode) {
			String stockName=tempNode.findPath("stockName").asText();
			al_stock.add(stockName);
			System.out.println("Stock Name\t\t\t"+stockName);
			
			int noOfShares=tempNode.findPath("noOfShares").asInt();
			al_stock.add(noOfShares);
			System.out.println("No of shares\t\t\t"+noOfShares);
			
			int sharePrice=tempNode.findPath("sharePrice").asInt();
			
			
			value_eachStock=noOfShares*sharePrice;
			al_stock.add(value_eachStock);
			System.out.println("Value of "+stockName+" Stock\t\t"+value_eachStock);
			total_value+=value_eachStock;
			System.out.println("==========================================");
		}
		
		al_stock.add(total_value);
		
		mapper.writeValue(oututFile,al_stock);
		
		System.out.println("Total Value\t\t\t"+total_value);
	
	  } 
		catch (Exception e) {
		e.printStackTrace();
	}
  }
}
