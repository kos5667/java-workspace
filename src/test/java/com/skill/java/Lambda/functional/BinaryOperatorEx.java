package com.skill.java.Lambda.functional;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorEx {
    
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator1 = (x, y) -> x + y;
        Integer result1 = binaryOperator1.apply(1, 2); // 3

        Comparator<Integer> comparator1 = Comparator.naturalOrder();

        Comparator<Integer> comparator2 = Comparator.reverseOrder();

        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.minBy(comparator1);
        Integer result2 = binaryOperator2.apply(2, 5);

        BinaryOperator<Integer> binaryOperator3 = BinaryOperator.maxBy(comparator2);
        Integer result3 = binaryOperator3.apply(2, 5);

        BinaryOperator<Item> binaryOperator4 = BinaryOperator.minBy((Item i1, Item i2) -> i1.getKey() - i2.getKey());
        Item item1 = new Item(10, "key1");
        Item item2 = new Item(20, "key2");
        Item min = binaryOperator4.apply(item1, item2);
        System.out.println(min.toString());
    }

    public static class Item {
        private int key;
        private String value;

        public Item(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return this.key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item [key=" + key + ", value=" + value + "]";
        }
    }
}
