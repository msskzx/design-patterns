package de.tum.in.ase.pse;

public abstract class Colleague {

	private String name;
	private Mediator mediator;

	public Colleague(Mediator mediator, String name) {
		this.setName(name);
		this.mediator = mediator;
	}

	public void send(String message) {
		mediator.send(message, this);
	}

	public abstract void receive(String message);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
}
