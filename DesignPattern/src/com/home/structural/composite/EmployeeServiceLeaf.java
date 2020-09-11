package com.home.structural.composite;

public class EmployeeServiceLeaf implements Service {

	@Override
	public void service(String serviceType) {
		System.out.println(serviceType+" for Employee");
	}

}
