package de.tum.in.ase.pse;

public class ChocolateBar implements Treat {

	private Ingredient ingredient;
	
	public ChocolateBar(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	
	@Override
	public Ingredient getIngredient() {
		return this.ingredient;
	}
}
