package de.tum.in.ase.pse.model;

import java.util.ArrayList;
import java.util.List;

import de.tum.in.ase.pse.view.Observer;

/**
 * This class is representing a factory machine, which is the model inside the
 * system.
 */
public abstract class Machine {

	/**
	 * 1.1 DONE: Create a list for the observers
	 */
	private List<Observer> observers;

	/**
	 * machine values
	 */
	private final String name;

	private final int minVoltage;
	private final int maxVoltage;
	private int targetVoltage;
	private int currentVoltage;

	private final int minTemperature;
	private final int maxTemperature;
	private int targetTemperature;
	private int currentTemperature;

	protected Machine(String name, int minVoltage, int maxVoltage, int targetVoltage, int minTemperature,
			int maxTemperature, int targetTemperature) {
		this.name = name;
		this.minVoltage = minVoltage;
		this.maxVoltage = maxVoltage;
		this.targetVoltage = targetVoltage;
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
		this.targetTemperature = targetTemperature;
		this.observers = new ArrayList<Observer>();
	}

	/**
	 * 1.2: DONE: Add a method addObserver(Observer) for adding observers to the
	 * list This method attaches an observer to the observer list.
	 */
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 1.2: DONE: Add a method removeObserver(Observer) for removing observers from
	 * the list This method detaches an observer from the observer list.
	 */

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * 1.3: DONE: Add a method notifyObservers() for updating observers in the list
	 * This method calls the update() method for each observer.
	 */

	protected abstract void notifyObservers();

	/**
	 * Standard setters for machine values, that can be changed/updated after
	 * instantiation. Further the setters notify the machine's observers. 1.4: DONE:
	 * Make sure that the observes get notified about all changes to the machine's
	 * parameters
	 */

	public void setTargetVoltage(int targetVoltage) {
		this.targetVoltage = targetVoltage;
		notifyObservers();

	}

	public void setCurrentVoltage(int currentVoltage) {
		this.currentVoltage = currentVoltage;
		notifyObservers();
	}

	public void setTargetTemperature(int targetTemperature) {
		this.targetTemperature = targetTemperature;
		notifyObservers();
	}

	public void setCurrentTemperature(int currentTemperature) {
		this.currentTemperature = currentTemperature;
		notifyObservers();
	}

	/**
	 * Standard getters for the machine values.
	 */

	public String getName() {
		return name;
	}

	public int getMinVoltage() {
		return minVoltage;
	}

	public int getMaxVoltage() {
		return maxVoltage;
	}

	public int getTargetVoltage() {
		return targetVoltage;
	}

	public int getCurrentVoltage() {
		return currentVoltage;
	}

	public int getMinTemperature() {
		return minTemperature;
	}

	public int getMaxTemperature() {
		return maxTemperature;
	}

	public int getTargetTemperature() {
		return targetTemperature;
	}

	public int getCurrentTemperature() {
		return currentTemperature;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}
}
