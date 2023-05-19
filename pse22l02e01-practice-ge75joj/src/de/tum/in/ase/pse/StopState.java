package de.tum.in.ase.pse;

public class StopState extends ElevatorState {

	@Override
	public void request(int floor, Controller controller) {
	}

	@Override
	public void signal(int floor, Controller controller) {
		if (controller.isPoolEmpty()) {
			controller.setState(new IdleState());
		} else {
			controller.setState(new MovingState());
		}

	}

	@Override
	public String getName() {
		return "Stop";
	}

}
