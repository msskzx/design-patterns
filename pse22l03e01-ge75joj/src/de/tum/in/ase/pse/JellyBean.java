package de.tum.in.ase.pse;

public class JellyBean implements Treat {
	
	private Ingredient ingredient;
	
	public JellyBean(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	@Override
	public Ingredient getIngredient() {
		return this.ingredient;
	}
}
