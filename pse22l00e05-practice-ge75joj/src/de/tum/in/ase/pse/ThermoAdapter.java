package de.tum.in.ase.pse;

public class ThermoAdapter implements ThermoInterface {

	private FahrenheitThermo thermo;

	public ThermoAdapter() {
		thermo = new FahrenheitThermo();
	}

	@Override
	public double getTempC() {
		return (thermo.getFahrenheitTemperature() - 32.0) * 5.0 / 9.0;
	}

	public FahrenheitThermo getThermo() {
		return thermo;
	}

	public void setThermo(FahrenheitThermo thermo) {
		this.thermo = thermo;
	}

}
