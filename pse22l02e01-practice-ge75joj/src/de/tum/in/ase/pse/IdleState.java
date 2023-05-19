package de.tum.in.ase.pse;

public class IdleState extends ElevatorState {

	@Override
	public void request(int floor, Controller controller) {
		// moving state
		controller.setState(new MovingState());
	}

	@Override
	public void signal(int floor, Controller controller) {
	}

	@Override
	public String getName() {
		return "Idle";
	}

}
