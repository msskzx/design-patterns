package de.tum.in.ase.pse;

public class Worker extends Employee {
	// DONE 1: Implement the Worker class

	public Worker(String name) {
		super(name);
	}

	// DONE 3: Implement listHierarchy() for Worker
	public void listHierarchy(int level) {
		this.printName(level);
	}
	
}
