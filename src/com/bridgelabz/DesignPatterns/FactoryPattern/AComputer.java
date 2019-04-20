package com.bridgelabz.DesignPatterns.FactoryPattern;

public abstract class AComputer {
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString() {
		return "Ram: "+this.getRam()+", HDD: "+this.getHDD()+", CPU: "+this.getCPU();
	}
}
