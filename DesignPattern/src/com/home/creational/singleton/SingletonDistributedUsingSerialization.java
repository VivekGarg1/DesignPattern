package com.home.creational.singleton;

import java.io.Serializable;

public class SingletonDistributedUsingSerialization implements Serializable {

	private static final long serialVersionUID = -7880542033962388294L;
	private static SingletonDistributedUsingSerialization INSTANCE=null;
	
	private SingletonDistributedUsingSerialization() {
		
	}
	
	public static SingletonDistributedUsingSerialization getInstance() {
		if(INSTANCE == null)
			INSTANCE=new SingletonDistributedUsingSerialization();
		return INSTANCE;
	}
	
	private Object readResolve() {
		return getInstance();
	}

}
