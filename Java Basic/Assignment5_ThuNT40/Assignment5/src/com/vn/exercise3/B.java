package com.vn.exercise3;

public class B extends A{
    public B(){
        super();
    }
    public int divide(int a, int b) throws Exception2 {
        if(b == 0)
            throw new Exception2("Divide by zero");
        return a / b;
    }
}
