package de.tum.in.ase.pse.burgerstore;

import de.tum.in.ase.pse.burger.BeefBurger;
import de.tum.in.ase.pse.burger.Burger;
import de.tum.in.ase.pse.burger.ChickenBurger;
import de.tum.in.ase.pse.burger.VeggieBurger;
import de.tum.in.ase.pse.ingredientsfactory.BurgerFactory;
import de.tum.in.ase.pse.ingredientsfactory.LondonBurgerFactory;

public class LondonBurgerStore extends BurgerStore {
	private final BurgerFactory ingredientFactory = new LondonBurgerFactory();

	public Burger createBurger(String item) {
		return switch (item) {
		case "beef" -> new BeefBurger("London Style Beef Burger", ingredientFactory);
		case "chicken" -> new ChickenBurger("London Style Chicken Burger", ingredientFactory);
		case "veggie" -> new VeggieBurger("London Style Vegan Burger", ingredientFactory);
		default -> throw new IllegalArgumentException("Invalid burger item: " + item);
		};
	}

}
