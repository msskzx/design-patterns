package de.tum.in.ase.pse;

import de.tum.in.ase.pse.buildables.Builder;
import de.tum.in.ase.pse.buildables.burgeringredients.Bun;
import de.tum.in.ase.pse.buildables.burgeringredients.Cheese;
import de.tum.in.ase.pse.buildables.burgeringredients.Lettuce;
import de.tum.in.ase.pse.buildables.burgeringredients.Onion;
import de.tum.in.ase.pse.buildables.burgeringredients.Patty;
import de.tum.in.ase.pse.buildables.burgeringredients.Pickle;
import de.tum.in.ase.pse.buildables.burgeringredients.Sauce;
import de.tum.in.ase.pse.buildables.burgeringredients.Tomato;

public class BurgerRestaurant {

	public void buildStandardBeefBurger(Builder<?> builder) {
		builder.addBun(Bun.BRIOCHE_BUN);
		builder.addPatty(Patty.BEEF_PATTY);
		builder.addSauce(Sauce.KETCHUP);
		builder.addCheese(Cheese.AMERICAN_CHEESE);
		builder.addLettuce(Lettuce.ICEBERG_LETTUCE);
		builder.addPickle(Pickle.CORNICHON);
		builder.addOnion(Onion.CARAMELIZED_ONION);
		builder.addTomato(Tomato.BEEFSTEAK_TOMATO);
	}

	public void buildSpecialBeefBurger(Builder<?> builder) {
		// DONE Part 3:
		builder.addBun(Bun.SESAME_BUN);
		builder.addPatty(Patty.BEEF_PATTY);
		builder.addPatty(Patty.BEEF_PATTY);
		builder.addSauce(Sauce.MAYO);
		builder.addSauce(Sauce.KETCHUP);
		builder.addSauce(Sauce.BBQ_SAUCE);
		builder.addCheese(Cheese.BRIE_CHEESE);
		builder.addCheese(Cheese.CHEDDAR_CHEESE);
		builder.addLettuce(Lettuce.ROMAINE_LETTUCE);
		builder.addPickle(Pickle.SPICY_SOUR_PICKLE);
		builder.addOnion(Onion.CARAMELIZED_ONION);
		builder.addTomato(Tomato.BEEFSTEAK_TOMATO);
	}

	public void buildStandardChickenBurger(Builder<?> builder) {
		// DONE Part 3:
		builder.addBun(Bun.CIABATTA_BUN);
		builder.addPatty(Patty.CHICKEN_PATTY);
		builder.addSauce(Sauce.YELLOW_MUSTARD);
		builder.addSauce(Sauce.CHIMICHURRI_SAUCE);
		builder.addCheese(Cheese.GOUDA_CHEESE);
		builder.addTomato(Tomato.CHERRY_TOMATO);
		builder.addOnion(Onion.DEEP_FRIED_ONION);
		builder.addLettuce(Lettuce.GREEN_LEAF_LETTUCE);
		builder.addPickle(Pickle.FULL_SOUR_PICKLE);
	}

}
