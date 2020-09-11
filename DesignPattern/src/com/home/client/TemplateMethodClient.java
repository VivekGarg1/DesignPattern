package com.home.client;

import com.home.behavioral.templatemethod.NonVegPizza;
import com.home.behavioral.templatemethod.PizzaTemplate;
import com.home.behavioral.templatemethod.VegPizza;

public class TemplateMethodClient {

	public static void main(String[] args) {
		
		PizzaTemplate vegPizza= new VegPizza();
		vegPizza.preparePizza();
		
		System.out.println("-----------------------");
		
		PizzaTemplate nonVegPizza= new NonVegPizza();
		nonVegPizza.preparePizza();
	}
}
