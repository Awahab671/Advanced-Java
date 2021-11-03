package com.collection.class28;

import java.util.ArrayList;

public class RemoveAllMethodArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Masoud");
        arrayList.add("Wahab");
        arrayList.add("Nailya");
        arrayList.add("Sharif");
        arrayList.add("Konstantin");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Wahab");
        list1.add("Masoud");
        list1.add("Nailya");
        arrayList.removeAll(list1);
        System.out.println(arrayList);
    }
}
