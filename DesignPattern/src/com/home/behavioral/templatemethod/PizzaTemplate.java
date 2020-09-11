package com.home.behavioral.templatemethod;

public abstract class PizzaTemplate {

	public final void preparePizza() {
		selectBread();
		addingIngredients();
		cooking();
		addingCheese();
		addingTopinngs();
	}

	public abstract void selectBread();

	public abstract void addingIngredients();

	public void cooking() {
		System.out.println("Cooking Pizza for 15 minutes!");
	}

	public void addingTopinngs() {
		System.out.println("Adding topinngs in pizza");
	}

	public void addingCheese() {
		System.out.println("Adding cheese in pizza");
	}
}
