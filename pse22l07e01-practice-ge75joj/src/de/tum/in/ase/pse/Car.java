package de.tum.in.ase.pse;

public abstract class Car {

	private String licensePlate;
	private int seats;
	private int hp;

	private int tankSize;
	private int batterySize;
	private int currentTank;
	private int currentBattery;

	public Car(String licensePlate, int seats, int hp) {
		this.licensePlate = licensePlate;
		this.seats = seats;
		this.hp = hp;
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}

	public int getSeats() {
		return seats;
	}

	public int getHp() {
		return hp;
	}

	public int getTankSize() {
		return tankSize;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public int getCurrentTank() {
		return currentTank;
	}

	public int getCurrentBattery() {
		return currentBattery;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public void setCurrentTank(int currentTank) {
		this.currentTank = currentTank;
	}

	public void setCurrentBattery(int currentBattery) {
		this.currentBattery = currentBattery;
	}

}
