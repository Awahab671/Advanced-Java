package com.collection;

public interface Trustable {
    void trust();
}
 interface Bank extends Trustable {
    void hasCheking();
    void hasSaving();
    default void hasCreditCard(){

    }
}
