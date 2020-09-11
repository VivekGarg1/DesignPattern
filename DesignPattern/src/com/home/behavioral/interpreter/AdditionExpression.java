package com.home.behavioral.interpreter;

public class AdditionExpression implements Expression {
	
	private String expression;

	public AdditionExpression(String expression) {
		super();
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngine interpreterEngine) {
		return interpreterEngine.addition(expression);
	}

}
