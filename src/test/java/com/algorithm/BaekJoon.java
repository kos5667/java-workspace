package com.algorithm;

import java.util.Scanner;

public class BaekJoon {

    public static void main(String[] args) {
        // Question2908();
        Question10040();
    }

    public static void Question2908() {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        System.out.println("A : "+a+", B : "+b);

        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        System.out.println("reverse");
        System.out.println("A : "+a+", B : "+b);

        if(Integer.parseInt(a) > Integer.parseInt(b))
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static void Question10040() {
        
        
    }

      
}
