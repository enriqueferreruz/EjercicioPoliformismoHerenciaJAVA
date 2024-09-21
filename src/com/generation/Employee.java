package com.generation;


public class Employee {
	
	String firstName;
	String lastName;
	int registration;
	int age;
	int daysWorked;
	double salary;
	int yearsWorked;
	
	int timeToRetirement=0;
	int vacationTimeLeft=0;
	int calculateBonus=0;

	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, double salary,
			int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}//constructor
	
     public int timeToRetirement() {
    	 int timeToRetirementByAge = 60 - age;
         int timeToRetirementByYearsWorked = 40 - yearsWorked;
         
         return Math.min(timeToRetirementByAge, timeToRetirementByYearsWorked);
    }//timeToRetirement
     
     public int vacationTimeLeft(int vacationsDaysTaken) {
    	 int vacationTimeLeft = (daysWorked/360)*(30- vacationsDaysTaken);
    	 return vacationTimeLeft;
     }//vacationTimeLeft
     
     public double calculateBonus() {
    	double bonus = 2.2*salary;
    	 return Math.round(bonus);
     }
}//class
