package de.tum.in.ase.pse.utils.crypto;

import de.tum.in.ase.pse.vendors.jasypt.AESCrypt;

public class Cryptography implements CryptoUtils {
	
	private AESCrypt algorithm;

	public Cryptography() {
		algorithm = new AESCrypt();
	}

	@Override
	public byte[] encrypt(String input) {
		return algorithm.encrypt(input);
	}

	@Override
	public String decrypt(byte[] input) {
		return algorithm.decrypt(input);
	}
}
