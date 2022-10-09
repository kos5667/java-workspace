package com.skill.java.Lambda.functional;

import java.util.function.BiFunction;

public class BiFunctionEx {
    
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
        Integer result = biFunction.apply(2, 3);

        
    }
}
