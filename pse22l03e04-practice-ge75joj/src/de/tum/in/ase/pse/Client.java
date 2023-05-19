package de.tum.in.ase.pse;

import de.tum.in.ase.pse.buildables.Builder;
import de.tum.in.ase.pse.buildables.Burger;
import de.tum.in.ase.pse.buildables.BurgerBuilder;
import de.tum.in.ase.pse.buildables.IngredientsList;
import de.tum.in.ase.pse.buildables.IngredientsListBuilder;

public final class Client {
	private Client() {
	}

	public static void main(String[] args) {

		BurgerRestaurant burgerRestaurant = new BurgerRestaurant();

		Builder<Burger> burgerBuilder = new BurgerBuilder();
		burgerRestaurant.buildStandardBeefBurger(burgerBuilder);
		Burger burger = burgerBuilder.getResult();

		System.out.println("You have selected the following Burger: " + burger.toString());

		IngredientsListBuilder ingredientsListBuilder = new IngredientsListBuilder();
		burgerRestaurant.buildSpecialBeefBurger(ingredientsListBuilder);
		IngredientsList specBurgeringreList = ingredientsListBuilder.getResult();

		System.out.println("You have selected the following Burger: " + specBurgeringreList.toString());

		burgerRestaurant.buildStandardChickenBurger(burgerBuilder);
		Burger chickenBurger = burgerBuilder.getResult();

		System.out.println("You have selected the following Burger: " + chickenBurger.toString());
	}
}
