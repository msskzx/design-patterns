package de.tum.in.ase.pse;

public abstract class Car {

	private static final int CAR_BASE_PRICE = 30_000;
	private static final int CAR_BASE_MAX_SPEED = 180; // in km/h
	private static final int ENGINE_UPGRADE_ADDED_SPEED = 120; // in km/h
	private static final int SPORTS_CAR_ADDED_PRICE = 100_000;
	private static final int SUV_ADDED_PRICE = 25_000;

	public Car() {
	}

	public abstract int calculateCarPrice();

	public abstract int calculateMaxSpeed();

	protected int getCarBasePrice() {
		return CAR_BASE_PRICE;
	}

	protected int getCarBaseMaxSpeed() {
		return CAR_BASE_MAX_SPEED;
	}

	protected static int getEngineUpgradeAddedSpeed() {
		return ENGINE_UPGRADE_ADDED_SPEED;
	}

	protected static int getSportsCarAddedPrice() {
		return SPORTS_CAR_ADDED_PRICE;
	}

	protected static int getSuvAddedPrice() {
		return SUV_ADDED_PRICE;
	}

}
