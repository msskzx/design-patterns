package de.tum.in.ase.pse.ingredientsfactory;

import java.util.List;

import de.tum.in.ase.pse.ingredients.bun.Bun;
import de.tum.in.ase.pse.ingredients.bun.SesameBun;
import de.tum.in.ase.pse.ingredients.cheese.CheddarCheese;
import de.tum.in.ase.pse.ingredients.cheese.Cheese;
import de.tum.in.ase.pse.ingredients.sauce.Ketchup;
import de.tum.in.ase.pse.ingredients.sauce.Sauce;
import de.tum.in.ase.pse.ingredients.veggie.Onion;
import de.tum.in.ase.pse.ingredients.veggie.Pickle;
import de.tum.in.ase.pse.ingredients.veggie.Tomato;
import de.tum.in.ase.pse.ingredients.veggie.Veggie;

public class LondonBurgerFactory implements BurgerFactory {

	@Override
	public Bun createBun() {
		return new SesameBun();
	}

	@Override
	public Sauce createSauce() {
		return new Ketchup();
	}

	@Override
	public List<Veggie> createVeggies() {
		return List.of(new Onion(), new Tomato(), new Pickle());
	}

	@Override
	public Cheese createCheese() {
		return new CheddarCheese();
	}
}
