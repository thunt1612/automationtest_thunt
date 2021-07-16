package com.vn.exercise3;

public class C extends B {
	public C() {
		super();
	}

	public int divide(int a, int b) throws Exception3 {
		if (b == 0)
			throw new Exception3("Divide by zero");
		return a / b;
	}
}
