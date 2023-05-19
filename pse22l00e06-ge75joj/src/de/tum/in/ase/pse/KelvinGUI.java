package de.tum.in.ase.pse;

import java.awt.Point;

public class KelvinGUI extends TemperatureGUI {

	public KelvinGUI(TemperatureModel model, Point location) {
		super("Kelvin Temperature", model, location);
		this.addRaiseTempListener(() -> this.getModel().increaseC(1.0));
		this.addLowerTempListener(() -> this.getModel().increaseC(-1.0));
		this.addDisplayListener(() -> {
			double value = getDisplay();
			this.getModel().setK(value);
		});
	}

	@Override
	public void onUpdate(Double newState) {
		this.setDisplay("" + TemperatureConverter.convertCelsiusToKelvin(newState));
	}

}
