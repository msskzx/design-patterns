package de.tum.in.ase.pse.ingredientsfactory;

import java.util.List;

import de.tum.in.ase.pse.ingredients.bun.Bun;
import de.tum.in.ase.pse.ingredients.cheese.Cheese;
import de.tum.in.ase.pse.ingredients.sauce.Sauce;
import de.tum.in.ase.pse.ingredients.veggie.Veggie;

public interface BurgerFactory {

	Bun createBun();

	Sauce createSauce();

	List<Veggie> createVeggies();

	Cheese createCheese();

}
