package de.tum.in.ase.pse;

import java.util.LinkedList;
import java.util.Queue;

public class Controller {

	private int currentFloor;
	private ElevatorState state;
	private Queue<Integer> pool;

	public Controller(int currentFloor) {
		state = new IdleState();
		pool = new LinkedList<Integer>();
		this.currentFloor = currentFloor;
	}

	public void request(int floor) {
		pool.add(floor);
		state.request(floor, this);
	}

	public void signal(int floor) {
		state.signal(floor, this);
	}

	public ElevatorState getState() {
		return state;
	}

	public int getNextStop() {
		return pool.peek();
	}

	public void removeNextStop() {
		pool.remove();
	}

	public void setState(ElevatorState state) {
		this.state = state;
	}

	public boolean isPoolEmpty() {
		return pool.isEmpty();
	}
	
	public Queue<Integer> getPool() {
		return pool;
	}

	public void setCurrentFloor(int floor) {
		currentFloor = floor;
	}
}
