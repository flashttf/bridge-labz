package com.bridgelabz.StructuralDesignPatterns.Proxy;

/*Here we are giving full access of CommandExecutorImpl only to admin users.
 * If the user is not admin the only limited will be allowed
 * 
 * 
 */
public class CommandExecutorProxy implements InterfaceCommandExecutor{
	
	private boolean isAdmin;
	private InterfaceCommandExecutor executor;
	
	 public CommandExecutorProxy(String user,String pwd) {
		// TODO Auto-generated constructor stub
		if("admin1".equals(user)&&"admin@123".equals(pwd))
			isAdmin=true;
		executor=new CommandExecutorImpl();
	}	
	
	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		if(isAdmin) {
			executor.runCommand(cmd);
		}else {
			if(cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users");
			}else {
				executor.runCommand(cmd);
			}
		}
	}

}
