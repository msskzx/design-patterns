package de.tum.in.ase.pse;

import java.text.DecimalFormat;

public final class TemperatureCurve {

	private static final int TEMPERATURE_SAMPLES = 15;

	private TemperatureCurve() {
	}

	public static void main(String[] args) {

		// DONE 4: Replace the implementation of CelsiusThermo with ThermoAdapter.
		ThermoInterface thermo = new ThermoAdapter();

		DecimalFormat df = new DecimalFormat("#.#");

		for (int i = 0; i < TEMPERATURE_SAMPLES; i++) {
			System.out.println("Sample " + (i + 1) + ": " + df.format(thermo.getTempC()));
		}
	}
}
