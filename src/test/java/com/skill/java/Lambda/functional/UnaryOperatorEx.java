package com.skill.java.Lambda.functional;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {
 
    public static void main(String[] args) {
        
        UnaryOperator<Integer> unaryOperator = x -> x * 2;
        Integer result = unaryOperator.apply(2); // 4;


    }
}
