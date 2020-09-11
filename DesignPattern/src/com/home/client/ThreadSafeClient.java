package com.home.client;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.home.creational.singleton.MyThread;


public class ThreadSafeClient {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = null;
		
		MyThread myThread=new MyThread();
		
		try {
			executorService=Executors.newFixedThreadPool(5);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(executorService != null)
				executorService.shutdown();
		}
	}

}
