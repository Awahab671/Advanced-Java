package com.collection.class29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class keyMapDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Masoud");
        arrayList.add("Wahab");
        arrayList.add("Wahid");
        arrayList.add("Sohail");
        arrayList.add("Mike");
        System.out.println(arrayList);
        Map<Integer, String> map = new HashMap<>();
        map.put(111, "Kabir");
        map.put(444, "Mars");
        map.put(567, "Mohammad");
        map.put(777, "Farhad");
        map.put(999, "Shahab");
        map.put(888, "Wasi");
        map.put(444, "Aref");
        System.out.println(map.get(444));
        System.out.println(map.get(111));
        //HashMap does not allow to have null keys and not null values.
        
    }
}
