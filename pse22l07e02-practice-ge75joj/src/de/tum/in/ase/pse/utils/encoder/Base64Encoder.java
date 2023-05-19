package de.tum.in.ase.pse.utils.encoder;

import de.tum.in.ase.pse.vendors.mig.MigBase64Encoder;

public class Base64Encoder implements EncoderUtils {

	@Override
	public String encodeToBase64(byte[] fileBytesArray) {
		return new MigBase64Encoder().encodeToBase64(fileBytesArray);
	}
}
