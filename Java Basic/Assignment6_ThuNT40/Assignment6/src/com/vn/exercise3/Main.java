package com.vn.exercise3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	  private static int findMin(Object[] array) {
	        int min = (Integer) array[0];
	        for(int i=1;i<array.length;i++) {
	            if(min > (Integer)array[i]) {
	                min = (Integer)array[i];
	            }
	        }
	        return min;
	    }
	    private static int findMax(Object[] array) {
	        int max = (Integer)array[0];
	        for(int i=1;i<array.length;i++) {
	            if(max < (Integer)array[i]) {
	                max = (Integer)array[i];
	            }
	        }
	        return max;
	    }
	    private static boolean findItem(Object[] array, int item) {
	        boolean ret = false;
	        for(int i=0;i<array.length;i++) {
	            if((Integer)array[i] == item){
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] arg){
	        //create a stack to store the integer value
	        Stack<Integer> data = new Stack<>();

	        //init stack
	        data.push(1);
	        data.push(2);
	        data.push(3);
	        data.push(4);
	        data.push(5);

	        //menu
	        System.out.println("=====================================================");
	        System.out.println("\t\t\tStack Operations Menu");
	        System.out.println("=====================================================");
	        System.out.println("1. Add items");
	        System.out.println("2. Delete items");
	        System.out.println("3. Show the number of items");
	        System.out.println("4. Show min and max items");
	        System.out.println("5. Find an item");
	        System.out.println("6. Print all items");
	        System.out.println("7. Exit");

	        //
	        Scanner optionScanner = new Scanner(System.in);
	        Scanner valueScanner;
	        boolean loop = true;
	        while(loop){
	            System.out.println("Enter your choice (1 to 7): ");

	            int input = optionScanner.nextInt();

	            switch (input){
	                case 1:
	                    //Option 1. Add items
	                    System.out.println("Enter your value:");
	                    //get new value from keyboard
	                    input = optionScanner.nextInt();
	                    //push new value to Stack
	                    data.push(input);
	                    break;
	                case 2:
	                    //Option 2. Delete items
	                    System.out.println("Enter your position to delete:");
	                    input = optionScanner.nextInt();
	                    try {
	                        data.remove(input);
	                    }catch (Exception ex){
	                        System.out.println(ex);
	                    }
	                    break;
	                case 3:
	                    //Option 3: Show the number of items
	                    System.out.println("The number of items:" + data.size());
	                    break;
	                case 4:
	                    //Option 4: Show min and max items
	                    Object[] array = data.toArray();
	                    int min = findMin(array);
	                    System.out.println("The minimum value of stack: " + min);

	                    int max = findMax(array);
	                    System.out.println("The minimum value of stack: " + max);
	                    break;
	                case 5:
	                    //Option 5: Find an item
	                    System.out.println("Enter your item that you want to find: ");
	                    input = optionScanner.nextInt();
	                    array = data.toArray();
	                    if(findItem(array, input)) {
	                        System.out.println("Stack contains " + input);
	                    }else{
	                        System.out.println("Stack doesn't contain " + input);
	                    }
	                    break;
	                case 6:
	                    //Option 6: Print all items
	                    System.out.println("All items of stack: " + Arrays.toString(data.toArray()));
	                    break;
	                case 7:
	                    //Option 7: Exit
	                    System.out.println("You are select option: 7. Exit");
	                    //closing the scanner object
	                    optionScanner.close();
	                    loop = false;
	                    break;
	                default:
	                    System.out.println("Option is wrong");
	                    break;
	            }
	        }

	    }

}
