package com.bridgelabz.StructuralDesignPatterns.Proxy;

public class ProxyPatternTest {
	public static void main(String[] args) {
		InterfaceCommandExecutor executor=new CommandExecutorProxy("admin1", "admin@123");
		
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
	}
}
