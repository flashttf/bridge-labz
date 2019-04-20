package com.bridgelabz.DesignPatterns.FactoryPattern;

public class TestFactory {
public static void main(String[] args) {
	AComputer pc=ComputerFactory.getComputer("pc","16 GB","1 TB","3.2 Ghz");
	AComputer server=ComputerFactory.getComputer("server", "32 GB", "10 TB", "3 Ghz");
	AComputer laptop=ComputerFactory.getComputer("laptop", "8 GB", "500 GB", "1.8 Ghz");
	System.out.println("Factory PC Config"+pc);
	System.out.println("Factory Server Config"+server);
	System.out.println("Factory Laptop"+laptop);
}
}
