package com.home.structural.adaptor;

public class MobileAdaptorImpl implements MobileAdaptor {

	private WallSocket wallSocket;
	
	public MobileAdaptorImpl(WallSocket wallSocket) {
		super();
		this.wallSocket = wallSocket;
	}

	@Override
	public Volt get3Volt() {
		Volt volts = wallSocket.getVolts();
		int v3=volts.getVolts()/80;
		return new Volt(v3);
	}

}
