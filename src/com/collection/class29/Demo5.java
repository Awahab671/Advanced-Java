package com.collection.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {

        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("Milk", 4.5);
        grocery.put("Eggplant", 5.5);
        grocery.put("Okra", 8.5);
        Set<String> mapkeys = grocery.keySet();
        for(String keys: mapkeys){
            System.out.println(keys);
        }
    }
}
