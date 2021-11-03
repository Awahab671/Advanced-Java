package com.collection.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(123, "Wahab");
        map.put(343, "Saber");
        map.put(678, "kabir");
        map.put(111, "Jahid");
        map.put(222, "shahab");

        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(777, "Wahab");
        map2.put(897, "Saber");
        map2.put(456, "kabir");
        map2.put(211, "Jahid");
        map2.put(125, "shahab");
        map2.putAll(map);
        System.out.println(map2);
        map2.remove(897);
        System.out.println(map2.remove(211));
        // This was copying a map into another map.
        //if we use TreeMap it will be in the order and if we use Hashmap it will not be in order that we wrote


            }
}
