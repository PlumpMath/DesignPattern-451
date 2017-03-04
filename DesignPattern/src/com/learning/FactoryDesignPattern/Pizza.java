package com.learning.FactoryDesignPattern;

public abstract class Pizza {
	/**
	 * for setting up the name of the pizza
	 */
	private String name;
	/**
	 * for setting up the price for pizza
	 */
	private double price = 0.0;

	public Pizza(String name) {
		super();
		this.name = name;
	}

	public Pizza(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public abstract void prepareIngrediant();

	public void bakePizza() {
		System.out.println("Baking Pizza it will take couple of minutes");
	}

	@Override
	public String toString() {
		return "This is the very famous " + name + " Pizza";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
