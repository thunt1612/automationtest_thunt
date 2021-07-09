package com.java.exercise;

public class Employee1 {
	private double finalSalary;
	private double hours;
	private double salary;
	
	private double getInfo() {
		this.finalSalary = hours*salary;
		this.addHour();
		this.addSal();
		return finalSalary;
	}
	
	private void addSal() {
		if(this.finalSalary < 500) {
			this.finalSalary += 10;
		}
	}
	
	private void addHour() {
		if(this.hours > 6) {
			this.finalSalary += 5;
		}
	}

	public static void main(String[] args) {
		Employee1 employee = new Employee1();
		employee.hours = 10;
		employee.finalSalary = 10;
		System.out.println(employee.getInfo());

	}

}
