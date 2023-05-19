package de.tum.in.ase.pse;

public final class FactoryGuest {
	private FactoryGuest() {
	}

	public static void main(String[] args) {
		// DONE Instantiate the Willy Wonka Factory
		// DONE Uncomment the following code and instantiate the objects
		// DONE Make sure the program does not crash upon exception being thrown and in
		// such a case
		// the error message (not the stack trace) are printed to the System.out
		// DONE Exactly after each object is instantiated call the getIngredient()
		// method on the instance and print
		// the output to the System.out (each on a new line)

		WillyWonkaFactory wwFactory = new WillyWonkaFactory();
		try {
			Treat myFirstTreat = wwFactory.createTreat(Ingredient.CHOCOLATE, Ingredient.SPECIAL_INGREDIENT);
			System.out.println(myFirstTreat.getIngredient());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Treat mySecondTreat = wwFactory.createTreat(Ingredient.GELATINE, Ingredient.SPECIAL_INGREDIENT);
			System.out.println(mySecondTreat.getIngredient());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Treat myThirdTreat = wwFactory.createTreat(Ingredient.CHOCOLATE, Ingredient.GELATINE);
			System.out.println(myThirdTreat.getIngredient());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
