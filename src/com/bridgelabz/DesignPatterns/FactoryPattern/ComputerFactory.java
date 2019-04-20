package com.bridgelabz.DesignPatterns.FactoryPattern;


/*->Factory pattern is used when we have  a super class with  multiple sub-classes
 * and based on input we have to	return one of the sub-class.Here instantiation
 * happens in Factory cLass rather than client class.
 * 
 * We can keep the Factory class as Singleton or we can keep the method 
 *that returns the 	subclass as static. 
 * Advantages:
 *<1> Factory Design Pattern provides approach to code for interface rather than implementation.
 *<2> Factory pattern removes the instantiation of actual implementation classes from client.
 *    This pattern makes the code more robust,less coupled and easy to extend.example:We can easily change the PC
 *    class implementation because client class is unaware of it.
 *<3> Factory pattern provides abstraction between implementation and client class through inheritance.
 */
public class ComputerFactory {
	public static AComputer getComputer(String type,String ram,String hdd,String cpu) {
		if("PC".equalsIgnoreCase(type))								//if type matches ,then it returns specified type object. 						
			return new PC(ram,hdd,cpu);
		else if("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		else if("Laptop".equalsIgnoreCase(type))
			return new Laptop(ram, hdd, cpu);
		return null;
	}
}
