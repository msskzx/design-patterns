package de.tum.in.ase.pse;

import java.io.IOException;
import java.nio.file.Path;

public final class ExamSystem {

	private ExamSystem() {
	}

	// DONE 5: Change signature, make use of the bridge pattern
	public static String hashFile(String document, Hashing hashing) {
		return hashing.hashDocument(document);
	}

	public static void main(String[] args) {
		String file1 = readFile("exams/short_exam.txt");
		String file2 = readFile("exams/long_exam.txt"); // This file is too big for Preview Hashing

		// DONE 6: Change SimpleHash to PreviewHashing
		Hashing simpleHash = new PreviewHashing();

		System.out.println(hashFile(file1, simpleHash));
		try {
			System.out.println(hashFile(file2, simpleHash));
			throw new IllegalStateException("Hashing this file with preview hashing should not work!");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		// DONE 6: Change CryptoSecureHashAlgorithm to EnterpriseHashing
		Hashing cryptoSecureHash = new EnterpriseHashing();

		System.out.println(hashFile(file1, cryptoSecureHash));
		System.out.println(hashFile(file2, cryptoSecureHash));
	}

	public static String readFile(String filepath) {
		Path path = Path.of(filepath);
		// DONE 4: Return the content of the passed file as a String.
		try {
			return java.nio.file.Files.readString(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

}
