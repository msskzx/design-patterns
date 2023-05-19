package de.tum.in.ase.pse;

public class PreviewHashing extends Hashing {

	private static final int MAX_CHARACTERS = 1000;

	public PreviewHashing() {
		super(new SimpleHashAlgorithm());
	}

	@Override
	public String hashDocument(String input) {
		if (input.length() > MAX_CHARACTERS) {
			throw new IllegalArgumentException("Preview version is not used for real exams");
		}
		return getImplementation().calculateHashCode(input);
	}

}
