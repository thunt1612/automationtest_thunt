package com.vn.exercise2;

public class Exercise2 {
	private static class MyException extends Exception {
		public MyException(String message) {
			super(message);
		}
	}

	public static int divide(int a, int b) throws MyException {
		if (b == 0)
			throw new MyException("Devide by zero");
		return a / b;
	}

	public static void main(String[] args) {
		try {
			int a = divide(10, 0);
		} catch (MyException ex) {
			System.out.println(ex);
		}
	}
}
