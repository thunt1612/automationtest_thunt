package com.vn.exercise2;

public class Main {

	public static void main(String[] args) {
		int[] b = new int[64];
		System.out.println("Length: " + b.length);

		for (int i = 0; i <= b.length - 1; i++) {
			b[i] = i + 1;
		}
		b = reverseArr(b, b.length);

		for (int i = 0; i <= b.length - 1; i++) {
			System.out.println(b[i]);
		}
	}

	static int[] reverseArr(int inputArr[], int length) {
		int outputArr[] = new int[length];
		for (int j = length - 1; j >= 0; j--) {
			outputArr[length - 1 - j] = inputArr[j];
		}
		return outputArr;
	}

}
