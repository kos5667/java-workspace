package com.algorithm;
import java.util.*;

public class Q2460 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(0);

            for(int i=0; i<10; i++) {
                int a=scan.nextInt(),b=scan.nextInt();
                list.add((list.get(i) - a) + b);
            }

            list.remove(0);
            int max=0;
            for(int i : list){
                if(i > max)
                    max = i;
            }
            System.out.println(max);
        }
    }    
}
