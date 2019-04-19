package com.bridgelabz.DesignPatterns.Singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	/*Java reflection provides the ability to inspect and modify the behaviour of application
	 * Using reflection we can ispect the class,interface,enum,get their structure,
	 * methods and fields at run-time even though the class is not accessible at compile time.
	 * 
	 *We can use reflection to instantiate an object,invoke its methods,change field values.
	 *Reflections are widely used in frameworks,cuz these framework have no knowledge of userdefined
	 *classes,interfaces and their method.
	 *
	 */
	public static void main(String[] args) {
		EagerInitializationSingleton instanceOne=EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton instanceTwo=null;
		
		try {
			Constructor[] constructors=EagerInitializationSingleton.class.getDeclaredConstructors();
			for(Constructor constructor:constructors) {
				//below code will destroy the the singleton pattern
				constructor.setAccessible(true);									
				instanceTwo=(EagerInitializationSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
