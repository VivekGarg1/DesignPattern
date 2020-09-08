package com.home.client;

import com.home.proxy.VeryExpensiveProcess;
import com.home.proxy.VeryExpensiveProcessProxy;

public class ProxyClient {
	public static void main(String[] args) {
		
		VeryExpensiveProcess veryExpensiveProcess=new VeryExpensiveProcessProxy();
		veryExpensiveProcess.process();
		veryExpensiveProcess.process();
	}

}
