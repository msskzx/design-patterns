package de.tum.in.ase.pse;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employee {

	private List<Employee> supervisedEmployees;

	public List<Employee> getSupervisedEmployees() {
		return supervisedEmployees;
	}

	public void setSupervisedEmployees(ArrayList<Employee> supervisedEmployees) {
		this.supervisedEmployees = supervisedEmployees;
	}

	public Supervisor(String name) {
		super(name);
		supervisedEmployees = new ArrayList<Employee>();
	}

	// DONE 2: Implement the Supervisor class

	// DONE 3: Implement listHierarchy() for Supervisor
	public void listHierarchy(int level) {
		this.printName(level);
		for (Employee e : supervisedEmployees) {
			e.listHierarchy(level + 1);
		}
	}

	public void hireEmployee(Employee employee) {
		this.supervisedEmployees.add(employee);
	}

	public void fireEmployee(Employee employee) {
		this.supervisedEmployees.remove(employee);
	}
}
