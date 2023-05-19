package de.tum.in.ase.pse;

// DONE Task 1.2: Make TemperatureModel observable by implementing Subject<Double>
public class TemperatureModel extends Subject<Double> {

	private double celsiusTemperature;

	public void setF(double tempF) {
		this.setC(TemperatureConverter.convertFahrenheitToCelsius(tempF));
	}

	public void setC(double tempC) {
		this.celsiusTemperature = tempC;
		// DONE Task 1.2: Notify all observers about the temperature change
		this.notifyObservers(tempC);
	}
	
	public void setK(double tempK) {
		this.celsiusTemperature = tempK;
		this.setC(TemperatureConverter.convertKelvinToCelsius(tempK));
	}

	public void increaseF(double amount) {
		final double currentFahrenheit = TemperatureConverter.convertCelsiusToFahrenheit(celsiusTemperature);
		final double newFahrenheit = currentFahrenheit + amount;

		this.setC(TemperatureConverter.convertFahrenheitToCelsius(newFahrenheit));
	}

	public void increaseC(double amount) {
		this.setC(this.celsiusTemperature + amount);
	}
	
	// DONE Task 2.2: Add Kelvin-Support by implementing setK() and increaseK()
	public void increaseK(double amount) {
		final double currentKelvin = TemperatureConverter.convertCelsiusToKelvin(celsiusTemperature);
		final double newKelvin = currentKelvin + amount;

		this.setC(TemperatureConverter.convertKelvinToCelsius(newKelvin));
	}

}
