package de.tum.in.ase.pse;

public class SportsCar extends Car {

	@Override
	public int calculateCarPrice() {
		return getCarBasePrice() + getSportsCarAddedPrice();
	}

	@Override
	public int calculateMaxSpeed() {
		return getCarBaseMaxSpeed() + getEngineUpgradeAddedSpeed();
	}

}
