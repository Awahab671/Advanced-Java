package com.collection.class29;

import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries = new HashMap<>();
        groceries.put("Egg", 2.0);
        groceries.put("Okra", 4.5);
        groceries.put("Meat", 3.0);
        groceries.put("Orange", 2.6);
        groceries.put("Watermelon", 7.0);
        groceries.put("Avocado", 9.9);
        System.out.println(groceries);
        //Here we used  groceries as key and the amount as values.
        // now lets put some null values and see what happen.
        groceries.put(null, null);
        groceries.put("Shirt", null);
        groceries.put(null, 5.0);
        groceries.put("Orange", null);
        System.out.println(groceries);
        //it will be printed and if has same key it will be overridden.
        groceries.replace("Egg",10.0); //it replaces the value of key which is Egg.
        System.out.println(groceries);
        System.out.println(groceries.containsKey("Orange"));  // it gives a boolean value .



    }
}
