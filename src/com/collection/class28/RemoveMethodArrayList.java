package com.collection.class28;

import java.util.ArrayList;

public class RemoveMethodArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Masoud");
        arrayList.add("Wahab");
        arrayList.add("Nailya");
        arrayList.add("Sharif");
        arrayList.add("Konstantin");
        System.out.println(arrayList);
        System.out.println(arrayList.remove("Wahab"));
        System.out.println(arrayList);
    }
}
