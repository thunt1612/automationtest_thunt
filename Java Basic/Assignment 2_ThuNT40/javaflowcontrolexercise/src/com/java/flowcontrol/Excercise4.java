package com.java.flowcontrol;

public class Excercise4 {
	public static void main(String[] args) {
		for (int number = 0; number <= 500; number++) {
			if (number == calc(number)) {
				System.out.println(number);
			}
		}

	}

	static int calc(int n) {
		int sum = 0;
		while (n % 10 > 0) {
			int a = n % 10;
			n = n / 10;
			sum += a * a * a;
		}

		return sum;

	}
}
