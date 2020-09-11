package com.home.creational.singleton;

public class SingletonWithStaticInstantiation {
	
	private static SingletonWithStaticInstantiation INSTANCE=null;
	
	private SingletonWithStaticInstantiation() {
		
	}
	
	static {
		try {
			if(INSTANCE == null)
				INSTANCE=new SingletonWithStaticInstantiation();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SingletonWithStaticInstantiation getInstance() {
		return INSTANCE;
	}

}
