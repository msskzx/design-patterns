package de.tum.in.ase.pse;

public final class TemperatureConverter {

	private static final double KELVIN_CONST = 273.15;

	private TemperatureConverter() {
		// Private constructor because a utility class should not be instantiable.
	}

	public static double convertCelsiusToFahrenheit(double celsius) {
		return celsius * (9.0 / 5.0) + 32.0;
	}

	public static double convertFahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32.0) * 5.0 / 9.0;
	}

	// DONE Task 2.2: Add Kelvin Converter Methods
	public static double convertCelsiusToKelvin(double celsius) {
		return celsius + KELVIN_CONST;
	}

	public static double convertKelvinToCelsius(double kelvin) {
		return kelvin - KELVIN_CONST;
	}

}
