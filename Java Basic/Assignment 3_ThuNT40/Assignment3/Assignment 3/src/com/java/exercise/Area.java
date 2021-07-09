package com.java.exercise;

import java.util.Scanner;

public class Area {
	static int length;
	static int breadth;

	public Area(int length, int breadth) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of retangle: ");
		length = sc.nextInt();
		this.length = length;
		System.out.println("Input the length of retangle: ");
		breadth = sc.nextInt();
		this.breadth = breadth;
	}

	int returnArea(int length, int breadth) {
		return length * breadth;
	}

	public static void main(String[] args) {
		Area area1 = new Area(length, breadth);
		System.out.println("Area: " + area1.returnArea(length, breadth));
	}

}
