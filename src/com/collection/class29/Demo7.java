package com.collection.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("Rice", 12.0);
        grocery.put("Pizza", 1.0);
        grocery.put("Pasta", 10.0);
        grocery.put("Meat", 11.0);
        grocery.put("Egg", 12.0);
        grocery.put("Okra", 4.0);
        grocery.put("Water", 8.0);
        Set<String> mapKeys = grocery.keySet();
        Iterator<String> iterator = mapKeys.iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            Double value = grocery.get(key);
            if(value>=10){
                iterator.remove();
            }
        }

        System.out.println(grocery);
    }
}
