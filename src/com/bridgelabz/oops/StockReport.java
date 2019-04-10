package com.bridgelabz.oops;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReport {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String inputFilePath="/home/admin1/Desktop/pawan/stockexchange.json";					//input file address
	String outputFilePath="/home/admin1/Desktop/pawan/stockexchangeop.json";				//output file address
	
	File inputFile=new File(inputFilePath);													//reference to inputfile
	File oututFile=new File(outputFilePath);												//reference to outputfile
	
	ObjectMapper mapper=new ObjectMapper();
	ArrayList al_stock=new ArrayList();
	
	int value_eachStock=0;
	int total_value=0;
	
	try {
		JsonNode node=mapper.readTree(inputFile);
		JsonNode rootNode=node.findPath("stock");
		
		for(JsonNode tempNode:rootNode) {
			String stock_name=tempNode.findPath("stock_name").asText();
			al_stock.add(stock_name);
			int no_of_shares=tempNode.findPath("no_of_shares").asInt();
			al_stock.add(no_of_shares);
			int share_price=tempNode.findPath("share_price").asInt();
			
			value_eachStock=no_of_shares*share_price;
			al_stock.add(value_eachStock);
			total_value+=value_eachStock;
		}
		al_stock.add(total_value);
		
		mapper.writeValue(oututFile,al_stock);
	
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
