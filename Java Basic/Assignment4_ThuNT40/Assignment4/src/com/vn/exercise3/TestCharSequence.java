package com.vn.exercise3;

public class TestCharSequence implements CharSequence {

	String content;

	public TestCharSequence(String content) {
		super();
		this.content = content;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	public String backwardString(String str, int start, int end) {
		CharSequence subString = str.subSequence(start, end);
		String backwardString = "";

		for (int i = subString.length() - 1; i >= 0; i--) {
			backwardString += subString.charAt(i);
		}
		return backwardString;

	}

	public static void main(String[] args) {
		TestCharSequence testObject = new TestCharSequence(
				"Write a class that implements the CharSequence interface found in the java.lang package. Your implementation should return the string backwards.");

		String finalString = testObject.backwardString(testObject.content, 0, 10);

		System.out.println("The input string: " + testObject.content);
		System.out.println();
		System.out.println("The string backwards from 0 to 100: " + finalString);
	}
}
