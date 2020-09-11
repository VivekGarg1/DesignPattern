package com.home.client;

import com.home.structural.composite.AdminServiceLeaf;
import com.home.structural.composite.EmployeeServiceLeaf;
import com.home.structural.composite.Service;
import com.home.structural.composite.ServiceProvider;

public class CompositeClient {
	
	public static void main(String[] args) {
		
		Service empService1=new EmployeeServiceLeaf();
		Service empService2=new EmployeeServiceLeaf();
		
		Service adminService3=new AdminServiceLeaf();
		
		ServiceProvider serviceProvider=new ServiceProvider();
		serviceProvider.addService(empService1);
		serviceProvider.addService(empService2);
		serviceProvider.addService(adminService3);
		
		serviceProvider.service("Registration Service");
		serviceProvider.deleteService(empService1);
		serviceProvider.addService(new AdminServiceLeaf());
		serviceProvider.service("Logout Service");
		serviceProvider.clearService();
	}

}
