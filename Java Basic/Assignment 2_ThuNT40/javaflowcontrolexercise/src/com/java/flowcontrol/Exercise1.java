package com.java.flowcontrol;

import java.util.Scanner;
import java.lang.Math;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner myNumber = new Scanner(System.in);
		System.out.println("Input a number: ");

		Float n = myNumber.nextFloat();
		System.out.println("Input value: " + n);
		if (n == 0) {
			System.out.println("zero");
		} else if (Math.abs(n) < 1) {
			System.out.println("small");
		} else if (n > 1000000) {
			System.out.println("large");
		} else if (n >= 1 && n <= 1000000) {
			System.out.println("positive");
		} else {
			System.out.print("negative");
		}
	}

}
