package com.collection.class28;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        /*Create an ArrayList that will store 5 names into it.
                Find out whether the given ArrayList is empty or not?
                Check whether the specific name is present in an ArrayList or not?
                Find the size of your arrayList and print all values from that*/
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Masoud");
        arrayList.add("Wahab");
        arrayList.add("Nailya");
        arrayList.add("Sharif");
        arrayList.add("Konstantin");
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Wahab"));
        System.out.println(arrayList.size());
        System.out.println(arrayList);


    }
}
