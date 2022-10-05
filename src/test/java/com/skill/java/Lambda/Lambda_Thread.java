package com.technology.java.Lambda;

public class Lambda_Thread {
    public static void main(String[] args) {
        Runnable task = () -> {
            int sum = 0;
            for(int i=0; i<10; i++) {
                sum += i;
                System.out.println(sum);
            }

            System.out.println("Current Thread : " + Thread.currentThread() + " Sum : "+ sum);
        };

        Thread sub1 = new Thread(task);
        Thread sub2 = new Thread(task);

        sub1.start();
        sub2.start();
    }
}
