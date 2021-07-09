package com.vn.exercise1;

public class Student {
	String name;
	
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public void checkName() {
		if (this.name == null) {
			this.name = "Unknown";
		}
	}

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("Thu");
		std1.checkName();
		std2.checkName();
		
		System.out.println("Name of std1: " + std1.name);
		System.out.println("Name of std2: " + std2.name);
		

	}

}
