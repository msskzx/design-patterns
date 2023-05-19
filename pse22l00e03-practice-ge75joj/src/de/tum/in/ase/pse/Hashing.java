package de.tum.in.ase.pse;

public abstract class Hashing {

	private HashFunction implementation;

	public Hashing(HashFunction implementation) {
		this.implementation = implementation;
	}

	public abstract String hashDocument(String input);

	public HashFunction getImplementation() {
		return implementation;
	}

	public void setImplementation(HashFunction implementation) {
		this.implementation = implementation;
	}
}
