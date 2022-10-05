package com.technology.java.Thread;

import java.util.ArrayList;
import java.util.List;

public class Demo_Thread extends Thread {
    int idx;

    public Demo_Thread(int idx) {
        this.idx = idx;
    }
    /**
     * Thread.join : Thread가 종료되고 main 종료
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("main start...");

        List<Thread> list =  new ArrayList<>();
        for(int i=0; i<10; i++) {
            Thread thread = new Demo_Thread(i);
            thread.start();
            list.add(thread);
        }

        for(Thread t : list) {
            try {
                t.join();
            } catch (Exception e) {
            }
        }

        System.out.println("main end...");
    }

    @Override
    public void run() {
        System.out.println(idx + " Thread Start...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(idx + " Thread End..");        
    }
}
