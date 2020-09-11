package com.home.creational.singleton;

public class SingletonPreventionWithClone implements Cloneable{

	private static SingletonPreventionWithClone INSTANCE=null;
	
	private SingletonPreventionWithClone() {
		
	}
	
	public static SingletonPreventionWithClone getInstance() {
		if(INSTANCE == null)
			INSTANCE=new SingletonPreventionWithClone();
		return INSTANCE;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton can not create with clone!!!");
		//return super.clone();
	}
}
