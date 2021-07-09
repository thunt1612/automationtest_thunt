package com.java.exercise;

public class Employee {
	private String name, address;
	private int year, salary;

	
	public Employee(String name, int year, int salary, String address) {
		this.name = name;
		this.year = year;
		this.salary = salary;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public int getYear() {
		return year;
	}


	public int getSalary() {
		return salary;
	}


	public static void main(String[] args) {
		 	Employee e1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
		    Employee e2 = new Employee("Sam", 2000, 740000, "68D- WallsStreet");
		    Employee e3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
		    
		    System.out.println("Name\tYear of joining\t\tAddress");
		    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getAddress());  
		    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getAddress()); 
		    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getAddress());  
	}

}
