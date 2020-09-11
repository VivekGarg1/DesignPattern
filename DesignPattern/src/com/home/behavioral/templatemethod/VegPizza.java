package com.home.behavioral.templatemethod;

public class VegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choosing bread for veg pizza");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding ingredients in veg pizza");
	}

}
