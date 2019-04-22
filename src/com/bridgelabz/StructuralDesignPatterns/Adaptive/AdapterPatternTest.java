package com.bridgelabz.StructuralDesignPatterns.Adaptive;

/*Adapter design pattern is one of the structural design pattern.
 * It is used so taht two unrelated interfaces can work together.
 * The object that joins  these unrelated interfaces is called an  Adapter.
 * Ex. Mobile Charger.
 * Steps:
 * <1>Create two classes-Volt(to measure volts) and Socket(producing constants of 120v)
 * <2>Now build adapter that produce 3v,12v and default 120v.So first we create 
 * 	  an Interface with these methods.
 * <3>Two ways to implement the adapter pattern.a)Class adapter,b)Object Adapter.
 * examples:1)java.util.Arrays#asList()
 * 			2)java.io.InputStreamReader(InputStream)(returns a  reader)
 * 			3)java.io.OutputStreamReader(OutputStream)(returns a Writer)
 */

public class AdapterPatternTest {
public static void main(String[] args) {
	testClassAdapter();
	testObjectAdapter();
}

private static void testObjectAdapter() {
	InterfaceSocketAdapter sockAdapter=new SocketObjectAdapterImpl();
	Volt v3=getVolt(sockAdapter,3);
	Volt v12=getVolt(sockAdapter, 12);
	Volt v120=getVolt(sockAdapter, 120);
	System.out.println("v3 volts using Object adapter:\t\t"+v3.getVolts());
	System.out.println("v12 volts using Object adapter:\t\t"+v12.getVolts());
	System.out.println("v120 volts using Object adapter:\t"+v120.getVolts());
	
}

private static void testClassAdapter() {
	InterfaceSocketAdapter sockAdapter=new SocketClassAdapterImpl();
	Volt v3=getVolt(sockAdapter,3);
	Volt v12=getVolt(sockAdapter, 12);
	Volt v120=getVolt(sockAdapter, 120);
	System.out.println("v3 volts using Class adapter:\t\t"+v3.getVolts());
	System.out.println("v12 volts using Class adapter:\t\t"+v12.getVolts());
	System.out.println("v120 volts using Class adapter:\t\t"+v120.getVolts());
}

private static Volt getVolt(InterfaceSocketAdapter sockAdapter, int i) {
		switch(i) {
		case 3: return sockAdapter.get3Volt();
		case 12:return sockAdapter.get12Volt();
		case 120:return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
	}
  }
}
