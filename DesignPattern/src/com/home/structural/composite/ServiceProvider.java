package com.home.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ServiceProvider implements Service{
	
	private List<Service> serviceList=new ArrayList<>();

	@Override
	public void service(String serviceType) {
		for (Service service : serviceList) {
			service.service(serviceType);
		}
	}
	
	public void addService(Service service) {
		serviceList.add(service);
	}
	
	public void deleteService(Service service) {
		serviceList.remove(service);
	}
	
	public void clearService() {
		serviceList.clear();
	}

}
