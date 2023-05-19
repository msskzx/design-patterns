package de.tum.in.ase.pse.vendors.mig;

import com.migcomponents.migbase64.Base64;

public class MigBase64Encoder {
	public String encodeToBase64(byte[] fileBytesArray) {
		return Base64.encodeToString(fileBytesArray, false);
	}
}
