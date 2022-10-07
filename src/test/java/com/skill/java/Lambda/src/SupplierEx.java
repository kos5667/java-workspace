package com.skill.java.Lambda.src;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * SupplierEx
 */
public class SupplierEx {

    public static void main(String[] args) {
        // supplierEx();

        intSupplierEx();
    }

    public static void supplierEx() {
        Supplier<String> supplier = () -> "Hello World";

        String result = supplier.get();

        System.out.println(result);
    }

    public static void intSupplierEx() {
        IntSupplier intSupplier1 = () -> 2 * 3;

        IntSupplier intSupplier2 = () -> { return (int) (Math.random() * 10); };

        int result1 = intSupplier1.getAsInt(); // 6

        int result2 = intSupplier2.getAsInt(); // random int
    }

    public static void longSupplier() {

    }

    public static void doubleSupplier() {

    }

    public static void booleanSupplier() {

    }
}