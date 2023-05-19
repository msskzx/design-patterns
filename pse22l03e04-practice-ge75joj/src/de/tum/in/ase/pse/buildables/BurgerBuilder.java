package de.tum.in.ase.pse.buildables;

import de.tum.in.ase.pse.buildables.burgeringredients.Bun;
import de.tum.in.ase.pse.buildables.burgeringredients.Cheese;
import de.tum.in.ase.pse.buildables.burgeringredients.Lettuce;
import de.tum.in.ase.pse.buildables.burgeringredients.Onion;
import de.tum.in.ase.pse.buildables.burgeringredients.Patty;
import de.tum.in.ase.pse.buildables.burgeringredients.Pickle;
import de.tum.in.ase.pse.buildables.burgeringredients.Sauce;
import de.tum.in.ase.pse.buildables.burgeringredients.Tomato;

public class BurgerBuilder implements Builder<Burger> {

	private Burger burger;

	public BurgerBuilder() {
		burger = new Burger();
	}

	@Override
	public BurgerBuilder addPatty(Patty patty) {
		if (burger.getBurgerPatty1() == null) {
			burger.setBurgerPatty1(patty);
			return this;
		}
		if (burger.getBurgerPatty2() == null) {
			burger.setBurgerPatty2(patty);
			return this;
		}
		throw new IllegalStateException();
	}

	@Override
	public BurgerBuilder addBun(Bun bun) {
		if (burger.getBun() == null) {
			burger.setBun(bun);
			return this;
		}
		throw new IllegalStateException();
	}

	@Override
	public BurgerBuilder addLettuce(Lettuce lettuce) {
		if (burger.getLettuce() == null) {
			burger.setLettuce(lettuce);
			return this;
		}
		throw new IllegalStateException();
	}

	@Override
	public BurgerBuilder addTomato(Tomato tomato) {
		if (burger.getTomato() == null) {
			burger.setTomato(tomato);
			return this;
		}
		throw new IllegalStateException();
	}

	@Override
	public BurgerBuilder addOnion(Onion onion) {
		if (burger.getOnion() == null) {
			burger.setOnion(onion);
			return this;
		}
		throw new IllegalStateException();
	}

	@Override
	public BurgerBuilder addPickle(Pickle pickle) {
		if (burger.getPickle() == null) {
			burger.setPickle(pickle);
			return this;
		}
		throw new IllegalStateException();
	}

	@Override
	public BurgerBuilder addCheese(Cheese cheese) {
		if (burger.getCheese1() == null) {
			burger.setCheese1(cheese);
			return this;
		}
		if (burger.getCheese2() == null) {
			burger.setCheese2(cheese);
			return this;
		}
		throw new IllegalStateException();
	}

	@Override
	public BurgerBuilder addSauce(Sauce sauce) {
		if (burger.getSauce1() == null) {
			burger.setSauce1(sauce);
			return this;
		}
		if (burger.getSauce2() == null) {
			burger.setSauce2(sauce);
			return this;
		}
		if (burger.getSauce3() == null) {
			burger.setSauce3(sauce);
			return this;
		}
		throw new IllegalStateException();
	}

	@Override
	public BurgerBuilder reset() {
		return new BurgerBuilder();
	}

	@Override
	public Burger getResult() {
		return this.burger;
	}

}
