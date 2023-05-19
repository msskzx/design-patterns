package de.tum.in.ase.pse.vendors.jasypt;

import org.jasypt.util.text.AES256TextEncryptor;

public class AESCrypt {

	private AES256TextEncryptor algorithm;

	public AESCrypt() {
		algorithm = new AES256TextEncryptor();
		algorithm.setPassword("PSEL07E02");
	}

	public byte[] encrypt(String input) {
		return algorithm.encrypt(input).getBytes();
	}

	public String decrypt(byte[] input) {
		return algorithm.decrypt(input.toString());
	}
}
