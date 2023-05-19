package de.tum.in.ase;

// TODO I.2: Implement the turn off command, which toggles the light off.
public class TurnOffLampCommand implements Command {

	private Lamp lamp;

	public TurnOffLampCommand(Lamp lamp) {
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		if (lamp.isTurnedOn()) {
			lamp.toggle();
		}
	}
}
