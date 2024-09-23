package com.generation;

import java.util.HashMap;

public class SalesManager extends SalesRep {

	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, double salary,
			int yearsWorked, double salesMade, double comission) {
		super(firstName, lastName, registration, age, daysWorked, salary, yearsWorked, salesMade, comission);

	HashMap<Integer, SalesRep> salesTeam = new HashMap<Integer, SalesRep>();
	salesTeam.put(001, "Juan", "Perez", 001, 47, 1130, 505.50, 5, 1550.36, 0);
	salesTeam.put(002, "Maria");
	}

}//class
