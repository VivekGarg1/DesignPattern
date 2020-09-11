package com.home.behavioral.templatemethod;

public class NonVegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choosing bread for non-veg pizza");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding ingredients in non-veg pizza");
	}

}
