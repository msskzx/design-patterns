package de.tum.in.ase.pse.ingredientsfactory;

import java.util.List;

import de.tum.in.ase.pse.ingredients.bun.Brioche;
import de.tum.in.ase.pse.ingredients.bun.Bun;
import de.tum.in.ase.pse.ingredients.cheese.AmericanCheese;
import de.tum.in.ase.pse.ingredients.cheese.Cheese;
import de.tum.in.ase.pse.ingredients.sauce.Barbecue;
import de.tum.in.ase.pse.ingredients.sauce.Sauce;
import de.tum.in.ase.pse.ingredients.veggie.Lettuce;
import de.tum.in.ase.pse.ingredients.veggie.Onion;
import de.tum.in.ase.pse.ingredients.veggie.Pickle;
import de.tum.in.ase.pse.ingredients.veggie.Tomato;
import de.tum.in.ase.pse.ingredients.veggie.Veggie;

public class NYBurgerFactory implements BurgerFactory {

	@Override
	public Bun createBun() {
		return new Brioche();
	}

	@Override
	public Sauce createSauce() {
		return new Barbecue();
	}

	@Override
	public List<Veggie> createVeggies() {
		return List.of(new Tomato(), new Lettuce(), new Pickle(), new Onion());
	}

	@Override
	public Cheese createCheese() {
		return new AmericanCheese();
	}
}
