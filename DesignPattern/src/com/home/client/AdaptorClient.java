package com.home.client;

import com.home.adaptor.MobileAdaptor;
import com.home.adaptor.MobileAdaptorImpl;
import com.home.adaptor.Volt;
import com.home.adaptor.WallSocket;
import com.home.adaptor.WallSocketImpl;

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
