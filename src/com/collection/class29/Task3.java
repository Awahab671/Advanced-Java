package com.collection.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("soap", 2);
        items.put("Blanket", 4);
        items.put("Pillow", 5);
        items.put("Towel", 1);

        System.out.println(items.size());
        Set<String> keys = items.keySet();

        Iterator<String> iterator = keys.iterator();

        while(iterator.hasNext()){
            String item = iterator.next();
            if(item.contains("o")){
                iterator.remove();
            }
        }
        System.out.println(items);
    }
}
