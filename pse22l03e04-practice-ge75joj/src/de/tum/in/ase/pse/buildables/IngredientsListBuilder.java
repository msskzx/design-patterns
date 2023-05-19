package de.tum.in.ase.pse.buildables;

import de.tum.in.ase.pse.buildables.burgeringredients.Bun;
import de.tum.in.ase.pse.buildables.burgeringredients.Cheese;
import de.tum.in.ase.pse.buildables.burgeringredients.Lettuce;
import de.tum.in.ase.pse.buildables.burgeringredients.Onion;
import de.tum.in.ase.pse.buildables.burgeringredients.Patty;
import de.tum.in.ase.pse.buildables.burgeringredients.Pickle;
import de.tum.in.ase.pse.buildables.burgeringredients.Sauce;
import de.tum.in.ase.pse.buildables.burgeringredients.Tomato;

public class IngredientsListBuilder implements Builder<IngredientsList> {

	private IngredientsList ingredientsList;
	
	public IngredientsListBuilder() {
		ingredientsList = new IngredientsList();
	}
	
	@Override
	public IngredientsListBuilder addPatty(Patty patty) {
		ingredientsList.addBurgerPatty(patty);
		return this;
	}

	@Override
	public IngredientsListBuilder addBun(Bun bun) {
		ingredientsList.addBun(bun);
		return this;
	}

	@Override
	public IngredientsListBuilder addLettuce(Lettuce lettuce) {
		ingredientsList.addLettuce(lettuce);
		return this;
	}

	@Override
	public IngredientsListBuilder addTomato(Tomato tomato) {
		ingredientsList.addTomato(tomato);
		return this;
	}

	@Override
	public IngredientsListBuilder addOnion(Onion onion) {
		ingredientsList.addOnion(onion);
		return this;
	}

	@Override
	public IngredientsListBuilder addPickle(Pickle pickle) {
		ingredientsList.addPickle(pickle);
		return this;
	}

	@Override
	public IngredientsListBuilder addCheese(Cheese cheese) {
		ingredientsList.addCheese(cheese);
		return this;
	}

	@Override
	public IngredientsListBuilder addSauce(Sauce sauce) {
		ingredientsList.addSauce(sauce);
		return this;
	}

	@Override
	public IngredientsListBuilder reset() {
		return new IngredientsListBuilder();
	}

	@Override
	public IngredientsList getResult() {
		return ingredientsList;
	}

	public IngredientsListBuilder getIngredientsList() {
		return this;
	}

	public IngredientsListBuilder setIngredientsList(IngredientsList ingredientsList) {
		this.ingredientsList = ingredientsList;
		return this;
	}

}
