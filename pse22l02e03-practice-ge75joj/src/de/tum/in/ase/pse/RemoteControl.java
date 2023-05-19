package de.tum.in.ase.pse;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the RemoteControl used to control the drone with. It
 * keeps a history with the previously sent commands and functions to control
 * the drone with
 */
public class RemoteControl {
	private final List<Command> history;

	/** DONE: Uncomment me after the interface implementation **/

	/** DONE: Uncomment me after the interface implementation **/
	public RemoteControl() {
		history = new ArrayList<Command>();
	}

	/**
	 * DONE: Add a controlDrone() function, taking a command, adding it to the
	 * command history and then executing it /** Tells the drone to execute the
	 * given command
	 **/

	public void controlDrone(Command command) {
		history.add(command);
		command.execute();
	}
}
