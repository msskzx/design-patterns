package de.tum.in.ase.pse;

public class MobileColleague extends Colleague {

	public MobileColleague(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void receive(String message) {
		System.out.println(message);
	}

}
