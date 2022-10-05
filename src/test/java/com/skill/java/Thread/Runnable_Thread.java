package com.skill.java.Thread;

import java.util.ArrayList;
import java.util.List;

public class Runnable_Thread implements Runnable {
    int idx;

    public Runnable_Thread(int idx) {
        this.idx = idx;
    }

    public static void main(String[] args) {
        System.out.println("main start...");

        List<Thread> list =  new ArrayList<>();
        for(int i=0; i<10; i++) {
            Thread thread = new Thread(new Runnable_Thread(i));
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
