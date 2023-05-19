package de.tum.in.ase.pse;

import java.awt.Point;

public class CelsiusGUI extends TemperatureGUI {

	public CelsiusGUI(TemperatureModel model, Point location) {
		super("Celsius Temperature", model, location);
		addRaiseTempListener(() -> getModel().increaseC(1.0));
		addLowerTempListener(() -> getModel().increaseC(-1.0));
		addDisplayListener(() -> {
			double value = getDisplay();
			getModel().setC(value);
		});
	}

	// DONE: 1.5.1: Implement onUpdatec: Invoke the method setDisplay() with the new
	// value converted to a String
	@Override
	public void onUpdate(Double newState) {
		this.setDisplay("" + newState);
	}

}
