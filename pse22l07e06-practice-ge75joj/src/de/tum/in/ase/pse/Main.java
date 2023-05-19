package de.tum.in.ase.pse;

public class Main {

	public static void handleOverdrawn() {
		System.out.println("Overdraw!");
	}

	public static void doTheUsualThing() {
		System.out.println("Withdrawal successful");
	}

	// main
	public static void main(String[] args) {

		// caller
		Account account = new Account(100);
		int amount = 120;

		try {
			account.withdraw(amount);
			doTheUsualThing();
		} catch (BalanceException e) {
			handleOverdrawn();
		}
	}

}
