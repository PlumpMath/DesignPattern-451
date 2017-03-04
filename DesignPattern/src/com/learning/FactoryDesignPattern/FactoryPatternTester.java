package com.learning.FactoryDesignPattern;

public class FactoryPatternTester {
	public static void main(String[] args) {
		Pizza italianPizza = PizzaFactory.getPizza("i");
		System.out.println("You are getting :" + italianPizza.getName());

		Pizza maxicanPizza = PizzaFactory.getPizza("m");
		System.out.println("You are getting :" + maxicanPizza.getName());
	}
}
