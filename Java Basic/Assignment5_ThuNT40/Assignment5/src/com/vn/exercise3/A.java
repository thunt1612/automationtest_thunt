package com.vn.exercise3;

public class A {
	public A() {

	}

	public int divide(int a, int b) throws Exception1 {
		if (b == 0)
			throw new Exception1("Divide by zero");
		return a / b;
	}
}
