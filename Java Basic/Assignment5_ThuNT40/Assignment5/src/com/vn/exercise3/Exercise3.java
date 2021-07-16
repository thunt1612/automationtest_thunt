package com.vn.exercise3;

public class Exercise3 {

	public static void main(String[] args) {
		// upcasting
		A c = new C();
		try {
			c.divide(10, 0);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		// downcasting
		C c1 = (C) c;
		try {
			c1.divide(10, 0);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
