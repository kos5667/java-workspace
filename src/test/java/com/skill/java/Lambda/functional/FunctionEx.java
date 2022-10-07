package com.skill.java.Lambda.functional;

import java.util.function.Function;

public class FunctionEx {
    
    public static void main(String[] args) {
        function1(2).apply(3); // 6
        function2(2).apply(3); // 6
    }

    public static Function<Integer, String> function1(int i) {
        return (n) -> {return "result : " + (n * i);};
    }

    public static Function<Integer, String> function2(int i) {
        return new Function<Integer, String>() {
            @Override
            public String apply(Integer n) {
                // TODO Auto-generated method stub
                return "result : " + (n * i);
            }
        };
    }
}
