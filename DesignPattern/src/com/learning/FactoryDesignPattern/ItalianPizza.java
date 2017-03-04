package com.learning.FactoryDesignPattern;

public class ItalianPizza extends Pizza {

	public ItalianPizza(double price) {
		super("Italian Pizza", price);
	}

	@Override
	public void prepareIngrediant() {
		System.out.println("Preparing ingrediant for Italian pizza...!!!");
	}

}
