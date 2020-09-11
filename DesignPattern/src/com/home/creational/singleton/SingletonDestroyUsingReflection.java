package com.home.creational.singleton;

public class SingletonDestroyUsingReflection {
	
	private static SingletonDestroyUsingReflection INSTANCE=null;
	
	private SingletonDestroyUsingReflection() {
		
		}
	
	
	public static SingletonDestroyUsingReflection getInstance() {
		if(INSTANCE == null)
			INSTANCE=new SingletonDestroyUsingReflection();
		return INSTANCE;
	}

}
