package com.collection.class19;

public interface Driveable {
    boolean Fast=true;
    void drive();
}
abstract class car{
    public void stop(){
        System.out.println("A car can stop.");
    }
}
