package com.skill.java.Lambda.functional;

import java.util.function.Consumer;

public class ConsumerEx {
    
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        consumer.accept("hello world");
    }
}
