package com.technology.java.Lambda;

public class LambdaTest {
 
    public static void main(String[] args) {
        
        // n = (n) -> {return n + 3};
        new Thread(() -> {
            System.out.println("\n");
        }).start();

        LambdaInterface lam = (a, b) -> {return a+b;};
        System.out.println(lam.cal(3, 4));
    }

}



