package de.tum.in.ase.pse;

public class RaceCar extends Vehicle {
	private static int instances;
	private static final int SPEED = 160;

	public RaceCar() {
		super("Rick", SPEED);
		instances++;
	}

	public static int getInstances() {
		return instances;
	}

	@Override
	public void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.printf(
				"The RaceCar %s moved with the speed of %d to the position with coordinates of X: %d and Y: %d%n",
				getName(), getSpeed(), newX, newY);
	}
}
