package de.tum.in.ase.pse;

public class WillyWonkaFactory {
	// DONE Create the createTreat() method

	public Treat createTreat(Ingredient ingredient1, Ingredient ingredient2) {
		Ingredient ingredient = Ingredient.CHOCOLATE;

		// no special ingredients
		// or both special ingredients
		if (ingredient1 == Ingredient.SPECIAL_INGREDIENT && ingredient2 == Ingredient.SPECIAL_INGREDIENT
				|| ingredient1 != Ingredient.SPECIAL_INGREDIENT && ingredient2 != Ingredient.SPECIAL_INGREDIENT) {
			throw new UnknownRecipeException("The special ingredient is missing!");
		}

		ingredient = ingredient1 == Ingredient.SPECIAL_INGREDIENT ? ingredient2 : ingredient1;

		switch (ingredient) {
		case CHOCOLATE:
			return new ChocolateBar(ingredient);
		case GELATINE:
			return new JellyBean(ingredient);
		default:
			return null;
		}
	}

}
