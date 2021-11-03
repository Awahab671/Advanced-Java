package com.collection.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        Map<String, Double> electronics = new LinkedHashMap<>();
        electronics.put("Television", 4.0);
        electronics.put("remote", 5.0);
        electronics.put("Dryer", 8.0);
        electronics.put("Phone", 2.0);

        Set<Map.Entry<String, Double>> entrySet = electronics.entrySet();

        for(Map.Entry<String, Double> entry:entrySet){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

    }
        }
