package com.vn.javabasic;

import java.util.Scanner;

public class Exercise4 {
	static int traVeSoBe(int number1, int number2) {
		if (number1 > number2) {
			return number2;
		}
		return number1;

	}

	static int traVeSoLon(int number1, int number2) {
		if (number1 > number2) {
			return number1;
		}
		return number2;

	}

	public static void main(String[] args) {
		int b1, b2, resultFinal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number: ");
		b1 = sc.nextInt();
		System.out.println("Input the second binary number ");
		b2 = sc.nextInt();

		if (b1 == b2) {
			resultFinal = 0;
		} else {
			if (b1 % 6 == b2 % 6) {
				resultFinal = traVeSoBe(b1, b2);
			} else {
				resultFinal = traVeSoLon(b1, b2);
			}
		}

		System.out.println("Result: " + resultFinal);

	}
}
