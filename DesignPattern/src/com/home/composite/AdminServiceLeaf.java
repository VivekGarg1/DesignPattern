package com.home.composite;

public class AdminServiceLeaf implements Service {

	@Override
	public void service(String serviceType) {
		System.out.println(serviceType+" for Admin");
	}

}
