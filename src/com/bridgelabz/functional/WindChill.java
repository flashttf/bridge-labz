package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {
	public static double calculateWindChill(){
		
		double t;
		double v;
		double windChill=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit and speed of wind in miles in hour");
		t=sc.nextDouble();
		v=sc.nextDouble();
		if((t<50)&&((v<120)&&(v>3))) {
		windChill=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		
		}
		else {
			System.out.println("Invalid Input");
		}
		return windChill;
	}
	
	public static void main(String[] args) {
		System.out.println(calculateWindChill());
	}
}
