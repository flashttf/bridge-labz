package com.bridgelabz.StructuralDesignPatterns.Proxy;

public class CommandExecutorImpl implements InterfaceCommandExecutor{

	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec(cmd);
		System.out.println("'"+cmd+"' command executed.");
	}

}
