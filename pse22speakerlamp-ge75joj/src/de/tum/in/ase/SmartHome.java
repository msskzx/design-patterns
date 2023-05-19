package de.tum.in.ase;

import java.util.HashSet;
import java.util.Set;

public class SmartHome {

	/*
	 * Use the Command Pattern to reimplement HomeKit.
	 */

	public static void main(String[] args) {
		HomeKit homeKit = new HomeKit();

		var lamp1 = new SimpleLamp();
		var lamp2 = new DimmableLamp();

		homeKit.connect(lamp1);
		homeKit.connect(lamp2);

		Command welcomeTurnOnLamp1 = new TurnOnLampCommand(lamp1);
		Command welcomeTurnOnLamp2 = new TurnOnLampCommand(lamp2);
		Set<Command> welcomeCommands = new HashSet<Command>();
		welcomeCommands.add(welcomeTurnOnLamp1);
		welcomeCommands.add(welcomeTurnOnLamp2);

		// TODO I.3: Instantiate a Scene called Welcome Home that turns all lamps on.
		Scene welcomeHomeScene = new Scene("Welcome", welcomeCommands);
		homeKit.configure(welcomeHomeScene);

		Command welcomeTurnOffLamp1 = new TurnOffLampCommand(lamp1);
		Command welcomeTurnOffLamp2 = new TurnOffLampCommand(lamp2);
		Set<Command> leaveHomeCommands = new HashSet<Command>();
		leaveHomeCommands.add(welcomeTurnOffLamp1);
		leaveHomeCommands.add(welcomeTurnOffLamp2);
		
		// TODO I.4: Instantiate a Scene called Leave Home that turns off all lamps.
		Scene leaveHomeScence = new Scene("Leave Home", leaveHomeCommands);
		homeKit.configure(leaveHomeScence);

		lamp2.setBrightness(42);
		welcomeHomeScene.trigger();
		leaveHomeScence.trigger();
		welcomeHomeScene.trigger();
	}
}
