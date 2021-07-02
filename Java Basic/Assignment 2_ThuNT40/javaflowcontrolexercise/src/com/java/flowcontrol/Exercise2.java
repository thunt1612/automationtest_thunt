package com.java.flowcontrol;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner myNumber = new Scanner(System.in);
		System.out.println("Input number of terms: ");
		
		int n = myNumber.nextInt();
		
		for (int m=0; m <= n; m++) {
			int cubeResult = m*m;
			System.out.println("Number is: " + m + " and cube of " + m + " is: " + cubeResult);
		}

	}

}
