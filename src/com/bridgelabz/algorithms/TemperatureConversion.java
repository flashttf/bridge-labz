package com.bridgelabz.algorithms;

import java.util.*;
public class TemperatureConversion {
	static Scanner sc=new Scanner(System.in);
	public static void fahrenheitToCelsius() {
		System.out.println("Enter temperature in fahrenheit");
		int fahrenheit=sc.nextInt();
		int result=(int)(fahrenheit-32)*5/9;
		System.out.println(result+" celsius");
	}
	public static void celsiusToFahrenheit() {
		System.out.println("Enter temperature in celsius");
		int celsius=sc.nextInt();
		int result=(int)(celsius*9/5)+32;
		System.out.println(result+" Fahrenheit");
	}
	
	public static void main(String[] args) {
		int ch;
		System.out.println("Enter 1 for Fahrenheit to Celsius\n Enter 2 for Celsius to Fahrenheit");
		ch=sc.nextInt();
		switch(ch) {
		case 1:fahrenheitToCelsius();break;
		case 2:celsiusToFahrenheit();break;
		}
	}
}
