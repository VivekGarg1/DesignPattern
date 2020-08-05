package com.home.singleton;

public class SingletonWithThreadSafe {
	
	private static SingletonWithThreadSafe INSTANCE=null;
	
	private SingletonWithThreadSafe() {
		}
	
	public static SingletonWithThreadSafe getInstance() {
		if(INSTANCE == null) {
			synchronized (SingletonWithThreadSafe.class) {
				if(INSTANCE == null) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				INSTANCE=new SingletonWithThreadSafe();
			}
			}
		}
		return INSTANCE;
	}

}
