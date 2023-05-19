package de.tum.in.ase.pse;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

	private List<Colleague> colleagues;

	public ConcreteMediator() {
		colleagues = new ArrayList<Colleague>();
	}

	@Override
	public void send(String message, Colleague sender) {
		for (Colleague colleague : colleagues) {
			if (!colleague.equals(sender)) {
				colleague.receive(message);
			}
		}
	}

	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
	}

	public List<Colleague> getColleagues() {
		return colleagues;
	}

	public void setColleagues(List<Colleague> colleagues) {
		this.colleagues = colleagues;
	}

}
