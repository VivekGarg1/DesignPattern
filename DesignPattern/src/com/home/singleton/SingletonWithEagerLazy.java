package com.home.singleton;

public class SingletonWithEagerLazy {
	
	private static final SingletonWithEagerLazy INSTANCE=new SingletonWithEagerLazy();
	
	private SingletonWithEagerLazy() {
		
	}
	
	public static SingletonWithEagerLazy getInstance() {
		return INSTANCE;
	}

}
