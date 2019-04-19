package com.bridgelabz.DesignPatterns.Singleton;

public class BillPughSingleton {
	
	//private constructor
	private  BillPughSingleton(){													
		
	}
	
	//inner static helper class
	private static class BillHelper{												
		private static final BillPughSingleton INSTANCE=new BillPughSingleton();	//private static final instance.
	}
	
	public static BillPughSingleton getInstance() {
		return BillHelper.INSTANCE;
	}
}
