package com.skill.java.Lambda.functional;

import java.util.function.Consumer;

public class ConsumerEx {
    
    /**
     * Consumer<T>
     * @param args
     */
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        consumer.accept("hello world");
    }
}
