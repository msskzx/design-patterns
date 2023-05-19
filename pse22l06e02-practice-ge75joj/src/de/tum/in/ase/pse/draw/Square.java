package de.tum.in.ase.pse.draw;

public class Square extends Shape {

	public Square(int width, int height, int x) {
		super(width, height, x, x);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Square: " + this);
	}
	
	public static Square changeForm(Shape shape) {
		return new Square(shape.getWidth(), shape.getHeight(), shape.getX());
	}
}

