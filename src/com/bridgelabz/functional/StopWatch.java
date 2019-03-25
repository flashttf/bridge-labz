package com.bridgelabz.functional;

import java.util.Scanner;

public class StopWatch {

	public long starttime;
	public long stoptime;
	public long elapsedtime;
	
	
	public void start() {
	    starttime=System.currentTimeMillis();
		System.out.println("StartTime is: "+starttime);
	}
	
	public void stop() {
		stoptime=System.currentTimeMillis();
		System.out.println("Stop time is: "+stoptime);
	}

	
	public long calculateElapsedTime() {
		elapsedtime=stoptime-starttime;
		return elapsedtime;
	}
	
	public static void main(String[] args) {
		StopWatch sw=new StopWatch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to start:");
		sc.nextInt();
		sw.start();
		
		System.out.println("Enter 2 to stop:");
		sc.nextInt();
		sw.stop();
		
		System.out.println("Elapsed time in seconds is "+(double)sw.calculateElapsedTime()/1000);
		
	}


}