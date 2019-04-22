package com.bridgelabz.StructuralDesignPatterns.Adaptive;

public class SocketObjectAdapterImpl implements InterfaceSocketAdapter{

	private Socket sock=new Socket();
	
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v=sock.getVolt();
		return convetVolt(v,10);
	}

	private Volt convetVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v=sock.getVolt();
		return convetVolt(v, 40);
				
	}

}
