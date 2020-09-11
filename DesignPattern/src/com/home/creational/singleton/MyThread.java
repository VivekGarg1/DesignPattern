package com.home.creational.singleton;

public class MyThread implements Runnable {

	@Override
	public void run() {
		
		SingletonWithThreadSafe threadSafe=SingletonWithThreadSafe.getInstance();
		
		System.out.println(Thread.currentThread().getName()+" "+threadSafe.hashCode());

	}

}
