package com.skill.java.Lambda.src;

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/**
 * SupplierEx
 */
public class SupplierEx {

    public static void main(String[] args) {
        // supplierEx();

        intSupplierEx();

        // longSupplier();
    }

    public static void supplierEx() {
        Supplier<String> supplier = () -> "Hello World";

        String result = supplier.get();

        System.out.println(result);
    }

    public static void intSupplierEx() {
        IntSupplier intSupplier1 = () -> Integer.MAX_VALUE; // 2147483647

        IntSupplier intSupplier2 = () -> Integer.MIN_VALUE; // -2147483648

        IntSupplier intSupplier3 = () -> { return (int) (Math.random() * 10); };

        int result1 = intSupplier1.getAsInt(); // 6

        int result2 = intSupplier2.getAsInt(); // random int

        int result3 = intSupplier3.getAsInt(); // random int

        System.out.println(result1);

        System.out.println(result2);
    }

    public static void longSupplier() {
        LongSupplier longSupplier1 = () -> Long.MAX_VALUE;

        LongSupplier longSupplier2 = () -> Long.MIN_VALUE;

        long result1 = longSupplier1.getAsLong(); // 9223372036854775807

        long result2 = longSupplier2.getAsLong(); // -9223372036854775808

        System.out.println(result1);

        System.out.println(result2);
    }

    public static void doubleSupplier() {

    }

    public static void booleanSupplier() {

    }
}