package com.vn.exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		
		//List before replacing
		System.out.println("List before replacing: " + list);
		list.set(2, "E");
		
		//List after replacing
		System.out.println("List after replacing: " + list);

	}

}
