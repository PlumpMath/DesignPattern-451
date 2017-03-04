/**
 * 
 */
package com.learning.FactoryDesignPattern;

/**
 * @author amar
 *
 */
public class MaxicanPizza extends Pizza {

	public MaxicanPizza(int price) {
		super("Maxican Pizza", price);
	}

	@Override
	public void prepareIngrediant() {
		System.out.println("Preparing ingredient for Maxican pizzaaaa.....!!!!");
	}

}
