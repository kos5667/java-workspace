package com.skill.java.Lambda.src;

import java.util.function.Supplier;

/**
 * SupplierEx
 */
public class SupplierEx {

    public static void main(String[] args) {
        
        Supplier<String> supplier = () -> "Hello World";

        String result = supplier.get();

        System.out.println(result);
    }
}