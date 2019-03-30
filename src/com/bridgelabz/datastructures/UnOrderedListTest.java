package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class UnOrderedListTest {
public static void main(String[] args) {
	try {
		Scanner scanner=new Scanner(System.in);
		boolean isPresent;
		
		String fileLocation="/home/admin1/Desktop/UnorderedList.txt";
		FileReader fileReader=new FileReader(fileLocation);
		BufferedReader bufferedreader=new BufferedReader(fileReader);
		String line=bufferedreader.readLine();
		System.out.println(line);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
