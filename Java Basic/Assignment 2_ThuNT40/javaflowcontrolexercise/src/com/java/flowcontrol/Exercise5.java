package com.java.flowcontrol;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner myNumber = new Scanner(System.in);
		System.out.println("Input number of terms: ");

		int n = myNumber.nextInt();
		float finalResult = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				finalResult -= 1.0 / i;
			} else {
				finalResult += 1.0 / i;
			}
		}

		System.out.println("Result: " + finalResult);
	}

}
