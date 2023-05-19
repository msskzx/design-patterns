package de.tum.in.ase.pse;

public class HybridCar extends Car {

	private FuelStation fuelStation;
	private SuperCharger superCharger;

	public HybridCar(String licensePlate, int seats, int hp, int tankSize, int batterySize, int currentTank,
			int currentBattery) {
		super(licensePlate, seats, hp);
		setTankSize(tankSize);
		setCurrentTank(currentTank);
		setBatterySize(batterySize);
		setCurrentBattery(currentBattery);
		fuelStation = new FuelStation();
		superCharger = new SuperCharger();
	}

	public void recharge() {
		superCharger.recharge(this);
	}

	public void refuel() {
		fuelStation.refuel(this);
	}

}
