package com.home.creational.singleton;

public class SingletonWithLazyInitialization {
	
	private static SingletonWithLazyInitialization INSTANCE=null;
	
	private SingletonWithLazyInitialization() {
		
	}
	
	public static SingletonWithLazyInitialization getInstance() {
		if(INSTANCE == null)
			INSTANCE=new SingletonWithLazyInitialization();
		return INSTANCE;
	}

}
