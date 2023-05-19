package de.tum.in.ase.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartHomeManagerServer {

	public static void main(String[] args) {
		ModelStorage.createSampleRollerShutters();
		SpringApplication.run(SmartHomeManagerServer.class, args);
	}

}
