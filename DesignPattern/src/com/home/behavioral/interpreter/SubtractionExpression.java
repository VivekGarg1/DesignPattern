package com.home.behavioral.interpreter;

public class SubtractionExpression implements Expression {
	
	private String expression;

	public SubtractionExpression(String expression) {
		super();
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngine interpreterEngine) {
		return interpreterEngine.subtraction(expression);
	}

}
