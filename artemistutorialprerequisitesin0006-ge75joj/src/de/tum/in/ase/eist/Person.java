package de.tum.in.ase.eist;

public class Person {
	// Done: implement according to problem statement
	
	private String name;
	private int age;
	private String tumId;
	
	public Person(String name, int age, String tumId) {
		this.name = name;
		this.age = age;
		this.tumId = tumId;
	}
	
	public void say(String text) {
		System.out.printf("%s said: %s", this.name, text);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTumId() {
		return tumId;
	}

	public void setTumId(String tumId) {
		this.tumId = tumId;
	}
	
}
