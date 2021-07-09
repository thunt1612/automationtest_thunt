package com.vn.exercise4;

public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return name + " (" + gender + ") at " + email;
	}

	public static void main(String[] args) {
		Author xuanQuynh = new Author("Xuan Quynh", "xaunquynhdieu@gmail.com", 'm');
		System.out.println(xuanQuynh.toString());

		xuanQuynh.setEmail("nguyenthu97@gmail.com");
		System.out.println(xuanQuynh.toString());
	}

}
