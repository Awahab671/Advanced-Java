package com.collection.class19;

public class ThisKeyWord {
    String make;
    String model;
    int year;

    void Car(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void printInfo(){
        String make= "Honda";
        String model = "Civic";
        int year= 2021;
    }
}
