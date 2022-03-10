package com.algorithm;

import java.util.Scanner;

public class Q2908 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String a = scan.next();
            String b = scan.next();

            a = new StringBuilder(a).reverse().toString();
            b = new StringBuilder(b).reverse().toString();

            if(Integer.parseInt(a) > Integer.parseInt(b))
                System.out.println(a);
            else
                System.out.println(b);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
