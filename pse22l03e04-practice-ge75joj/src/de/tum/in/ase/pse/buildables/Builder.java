package de.tum.in.ase.pse.buildables;

import de.tum.in.ase.pse.buildables.burgeringredients.Bun;
import de.tum.in.ase.pse.buildables.burgeringredients.Cheese;
import de.tum.in.ase.pse.buildables.burgeringredients.Lettuce;
import de.tum.in.ase.pse.buildables.burgeringredients.Onion;
import de.tum.in.ase.pse.buildables.burgeringredients.Patty;
import de.tum.in.ase.pse.buildables.burgeringredients.Pickle;
import de.tum.in.ase.pse.buildables.burgeringredients.Sauce;
import de.tum.in.ase.pse.buildables.burgeringredients.Tomato;

public interface Builder<T> {

	Builder<T> addPatty(Patty patty);

	Builder<T> addBun(Bun bun);

	Builder<T> addLettuce(Lettuce lettuce);

	Builder<T> addTomato(Tomato tomato);

	Builder<T> addOnion(Onion onion);

	Builder<T> addPickle(Pickle pickle);

	Builder<T> addCheese(Cheese cheese);

	Builder<T> addSauce(Sauce sauce);

	Builder<T> reset();

	T getResult();
	
}
