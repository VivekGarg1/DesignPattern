package com.home.client;

import com.home.structural.adaptor.MobileAdaptor;
import com.home.structural.adaptor.MobileAdaptorImpl;
import com.home.structural.adaptor.Volt;
import com.home.structural.adaptor.WallSocket;
import com.home.structural.adaptor.WallSocketImpl;

public class AdaptorClient {
	
	public static void main(String[] args) {
		WallSocket socket=new WallSocketImpl();
		Volt v240 = socket.getVolts();
		System.out.println("Wall Socket volts is: "+v240);
		
		MobileAdaptor adaptor=new MobileAdaptorImpl(socket);
		Volt get3Volt = adaptor.get3Volt();
		System.out.println("Mobile Adaptor volts is: "+get3Volt);
	}

}
