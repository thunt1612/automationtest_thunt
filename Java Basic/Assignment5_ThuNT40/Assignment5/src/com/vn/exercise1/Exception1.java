package com.vn.exercise1;

public class Exception1 {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        try {
            int a = divide(10, 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
    }
}