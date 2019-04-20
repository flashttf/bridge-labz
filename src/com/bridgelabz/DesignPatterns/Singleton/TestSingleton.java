package com.bridgelabz.DesignPatterns.Singleton;

public class TestSingleton {
public static void main(String[] args) {
	
	//Testing EagerInitializationSingleton
	EagerInitializationSingleton eager=EagerInitializationSingleton.getInstance();
	EagerInitializationSingleton eager1=EagerInitializationSingleton.getInstance();
	
	System.out.println("Printing address of eagerInititialization  first reference: "+eager.hashCode());
	System.out.println("Printing address of eagerInititialization second reference: "+eager1.hashCode());
	System.out.println("============================================================================\n");
	
	
	//Testing staticblocksingleton
	
	StaticBlockSingleton obj=StaticBlockSingleton.getInstance();
	StaticBlockSingleton obj1=StaticBlockSingleton.getInstance();
	System.out.println("Address of first static block Singleton object: "+obj.hashCode());
	System.out.println("Address of second static block Singleton object: "+obj.hashCode());
	System.out.println("============================================================================\n");
	
	//Testing LazySingleton
	LazyInitializationSingleton lazyInitializationSingleton=LazyInitializationSingleton.getInstance();
	LazyInitializationSingleton lazyInitializationSingleton2=LazyInitializationSingleton.getInstance();
	System.out.println("Lazy Address:"+lazyInitializationSingleton.hashCode());
	System.out.println("Lazy Address2:"+lazyInitializationSingleton.hashCode());
	System.out.println("====================================================");
	
	//Testing threadsafe singleton
	ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance();
	ThreadSafeSingleton threadSafeSingleton2=ThreadSafeSingleton.getInstance();
	System.out.println("ThreadSafe Address: "+threadSafeSingleton.hashCode());
	System.out.println("ThreadSafe Address: "+threadSafeSingleton.hashCode());
	System.out.println("======================================================");
	
	//Testing enumSingleton
	SingletonEnum singletonEnum=SingletonEnum.getInstance();
	SingletonEnum singletonEnum2=SingletonEnum.getInstance();
	System.out.println("EnumSingleton Object:"+singletonEnum.hashCode());
	System.out.println("EnumSingleton Object2"+singletonEnum.hashCode());
	System.out.println("=====================================================");
	}
	


}
