package com.bridgelabz.DesignPatterns.FactoryPattern;

public class Laptop extends AComputer{
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public Laptop(String ram,String hdd,String cpu) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
