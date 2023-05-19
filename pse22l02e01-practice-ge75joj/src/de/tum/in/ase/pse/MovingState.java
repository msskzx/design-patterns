package de.tum.in.ase.pse;

public class MovingState extends ElevatorState {

	@Override
	public void request(int floor, Controller controller) {

	}

	@Override
	public void signal(int floor, Controller controller) {
		if (controller.getNextStop() == floor) {
			controller.setState(new StopState());
			controller.removeNextStop();
			controller.setCurrentFloor(floor);
		}
	}

	@Override
	public String getName() {
		return "Moving";
	}

}
