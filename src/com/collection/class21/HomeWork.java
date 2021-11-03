package com.collection.class21;

public class HomeWork {
    String name = "Wahab";

    void printName() {
        System.out.println("Name is " + name);
    }

    void getMarried() {
        System.out.println("My children will get married whenever they want.");
    }
}
    class Child extends HomeWork{
        String name = "Masoud";
        void printName(){
            System.out.println("Name is "+name);
        }
        void getMarried(){
            System.out.println("I will get married very soon.");
        }
void LetsDoSomethingCrazy(){
            getMarried();
            super.getMarried();
}
}
