package com.technology.java;

public class RunningTimeModule {
    
    public static void main(String[] args) {
        run();
    }

    static void run() {
        long beforeTime = System.currentTimeMillis();

        testMethod();

        long afterTime = System.currentTimeMillis();
        
        long secDifferenceTime = (afterTime - beforeTime) / 1000;
        System.out.println("A : "+afterTime+" B : "+beforeTime);
        System.out.println(secDifferenceTime);
    }

    static void testMethod() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
