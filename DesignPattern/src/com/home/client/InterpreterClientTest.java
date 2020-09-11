package com.home.client;

import com.home.behavioral.interpreter.InterpreterClient;
import com.home.behavioral.interpreter.InterpreterEngine;

public class InterpreterClientTest {

	public static void main(String[] args) {
		
		InterpreterEngine interpreterEngine=new InterpreterEngine();
		InterpreterClient interpreterClient=new InterpreterClient(interpreterEngine);
		System.out.println("Addition of both number is : "+interpreterClient.interpret("add 200 and 75"));
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Addition of both number is : "+interpreterClient.interpret("subtract 30 and 10"));
	}
}
