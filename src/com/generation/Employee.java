package com.generation;


public class Employee {
	
	String firstName;
	String lastName;
	int registration;
	static int age;
	static int daysWorked;
	static double salary;
	static int yearsWorked;
	
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
	
     public static int timeToRetirement() {
    	 int timeToRetirementByAge = 60 - age;
         int timeToRetirementByYearsWorked = 40 - yearsWorked;
         
         return Math.min(timeToRetirementByAge, timeToRetirementByYearsWorked);
    }//timeToRetirement
     
     public static int vacationTimeLeft(int vacationsDaysTaken) {
    	 int vacationTimeLeft = (daysWorked/360)*(30- vacationsDaysTaken);
    	 return vacationTimeLeft;
     }//vacationTimeLeft
     
     public static double calculateBonus() {
    	double bonus = 2.2*salary;
    	 return Math.round(bonus);
     }

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", salary=" + salary + ", yearsWorked=" + yearsWorked
				+ "]";
	}
}//class
