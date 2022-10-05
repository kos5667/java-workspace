package com.skill.java.Lambda.src;

import java.util.function.Function;

public class FunctionEx {
    
    public static void main(String[] args) {

        Function<Integer, String> function = (n) -> "parameter : " + n;
        String result = function.apply(5);

        System.out.println(result);

        Function<Integer, Integer> function2 = (n) -> { return n * n; };
    }

}
