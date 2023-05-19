package de.tum.in.ase.pse;

public class ElectricCar extends Car {

	private SuperCharger superCharger;

	public ElectricCar(String licensePlate, int seats, int hp, int batterySize, int currentBattery) {
		super(licensePlate, seats, hp);
		setTankSize(0);
		setCurrentTank(0);
		setBatterySize(batterySize);
		setCurrentBattery(currentBattery);
		superCharger = new SuperCharger();
	}

	public void recharge() {
		superCharger.recharge(this);
	}

}
