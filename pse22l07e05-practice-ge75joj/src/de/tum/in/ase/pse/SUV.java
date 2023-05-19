package de.tum.in.ase.pse;

public class SUV extends Car {

	@Override
	public int calculateCarPrice() {
		return getCarBasePrice() + getSuvAddedPrice();
	}

	@Override
	public int calculateMaxSpeed() {
		return getCarBaseMaxSpeed() / 2 + getEngineUpgradeAddedSpeed();
	}

}
