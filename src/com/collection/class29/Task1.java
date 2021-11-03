package com.collection.class29;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Kiwi", 5);
        fruits.put("Apple", 2);
        fruits.put("Watermelon", 4);
        fruits.put("Peach", 7);
        fruits.put("Mango", 9);
        fruits.put("Melon", 8);
        System.out.println(fruits);
        fruits.remove("kiwi");
        System.out.println(fruits);
    }
}
