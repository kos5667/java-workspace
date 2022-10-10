package com.skill.java.Lambda.functional;

import java.util.function.Predicate;

public class PredicateEx {
 
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i > 2;
        predicate.test(1); // false
        predicate.test(3); // true

        Predicate<Integer> predicate1 = (num) -> num > 10;
        Predicate<Integer> predicate2 = (num) -> num < 20;

        boolean result1 = predicate1.and(predicate2).test(25);
        System.out.println("25 : 10 < num < 20 ? " + result1); // false

        result1 = predicate1.and(predicate2).test(15);
        System.out.println("15: 10 < num < 20 ? " + result1); // true


        Predicate<Integer> predicate3 = (num) -> num > 10;
        Predicate<Integer> predicate4 = (num) -> num < 0;

        boolean result2 = predicate3.or(predicate4).test(5);
        System.out.println("5 : num < 0 or num > 10 ? " + result2); // false

        result2 = predicate3.or(predicate4).test(15);
        System.out.println("15 : num < 0 or num > 10 ? " + result2); // true

        result2 = predicate3.or(predicate4).test(-5);
        System.out.println("-5 : num < 0 or num > 10 ? " + result2); // true

    }
}
