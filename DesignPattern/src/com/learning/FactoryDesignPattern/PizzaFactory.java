package com.learning.FactoryDesignPattern;

public class PizzaFactory {
	public static Pizza getPizza(String typeOfPizza) {
		typeOfPizza = typeOfPizza.trim().toUpperCase();
		switch (typeOfPizza) {
		case "I":
			return new ItalianPizza(500);
		case "M":
			return new MaxicanPizza(6000);
		default:
			return null;
		}
	}
}
