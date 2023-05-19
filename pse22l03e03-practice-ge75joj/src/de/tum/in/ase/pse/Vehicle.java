package de.tum.in.ase.pse;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Vehicle {

	private String name;
	private int speed;
	private BufferedImage image;

	public Vehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
		try {
			File file;
			if (name.equals("Morty")) {
				file = new File("resources/Mechanical_Morty.png");
			} else {
				file = new File("resources/Rick_angry.png");
			}
			this.setImage(ImageIO.read(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public abstract void moveCar(int currentX, int currentY, int newX, int newY);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
}
