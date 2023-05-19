package de.tum.in.ase.pse;

import java.awt.Point;

public class FahrenheitGUI extends TemperatureGUI {

	public FahrenheitGUI(TemperatureModel model, Point location) {
		super("Fahrenheit Temperature", model, location);
		addRaiseTempListener(() -> getModel().increaseF(1.0));
		addLowerTempListener(() -> getModel().increaseF(-1.0));
		addDisplayListener(() -> {
			double value = getDisplay();
			getModel().setF(value);
		});
	}

	// DONE 1.5.2: Implement onUpdate: pass with the Fahrenheit value to
	// setDisplay(...) by converting
	// the Celsius value with the TemperatureConverter and the converting this
	// Fahrenheit value to a string
	@Override
	public void onUpdate(Double newState) {
		this.setDisplay("" + TemperatureConverter.convertCelsiusToFahrenheit(newState));
	}
}
