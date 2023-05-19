package de.tum.in.ase;

// TODO I.1: Implement the turn on command, which toggles the light on.
public class TurnOnLampCommand implements Command {

	private Lamp lamp;

	public TurnOnLampCommand(Lamp lamp) {
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		if (!lamp.isTurnedOn()) {
			lamp.toggle();
		}
	}

}
