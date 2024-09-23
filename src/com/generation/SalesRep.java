package com.generation;

public class SalesRep extends Employee {
	
	static double salesMade;
	double comission;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, double salary,
			int yearsWorked, double salesMade, double comission) {
		super(firstName, lastName, registration, age, daysWorked, salary, yearsWorked);
		this.salesMade=salesMade;
		this.comission=comission;
		
	}
	
	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", comission=" + comission + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

	public static double calculateComission() {
		double comission=0.1*salesMade;
		return Math.round(comission);
	}

}//class
