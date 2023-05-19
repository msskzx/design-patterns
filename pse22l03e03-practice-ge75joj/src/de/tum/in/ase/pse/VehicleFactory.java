package de.tum.in.ase.pse;

import java.util.HashMap;
import java.util.Map;

public final class VehicleFactory {

	private static final Map<String, Vehicle> cache = new HashMap<>();

	private VehicleFactory() {
	}

	public static Vehicle getVehicle(String name) {
		if (cache.containsKey(name)) {
			return cache.get(name);
		}
		Vehicle vehicle = switch (name) {
		case "Morty" -> new Car();
		case "Rick" -> new RaceCar();
		default -> throw new IllegalArgumentException("Unsupported car type.");
		};

		cache.put(name, vehicle);
		return vehicle;
	}
}
