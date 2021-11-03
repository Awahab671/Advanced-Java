package com.collection.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<Double, String> employeeTable = new LinkedHashMap<>();
        employeeTable.put(3.0, "Wahab");
        employeeTable.put(1.0, "Kevin");
        employeeTable.put(5.0, "Rasool");
        employeeTable.put(7.0, "Hamed");
        employeeTable.put(8.0, "Taha");
        employeeTable.put(9.0, "Baraan");
        System.out.println(employeeTable);
        Set<Double> mapKeys = employeeTable.keySet();
        Iterator<Double> iterator = mapKeys.iterator();
        while (iterator.hasNext()){
            Double key = iterator.next();
            System.out.println(key);
        }

    }
}
