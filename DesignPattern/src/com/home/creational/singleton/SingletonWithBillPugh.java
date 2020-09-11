package com.home.creational.singleton;

public class SingletonWithBillPugh {
	
	private static SingletonWithBillPugh INSTANCE=null;
	
	private SingletonWithBillPugh() {
		}
	
	private static class SingletonWithBillPughHolder{
		private static SingletonWithBillPugh INSTANCE=new SingletonWithBillPugh();
	}
	
	public static SingletonWithBillPugh getInstance() {
		return SingletonWithBillPughHolder.INSTANCE;
	}

}
