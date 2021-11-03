package com.collection.class32;

public class MasoudWahab {
    private String name;
    private String phoneNumber;
    private int age;
    private String ssn;
    private String password;


    public void setName(String name) {
        if(name.length()<20) {
            this.name = name;
            System.out.println(this.name);

        }else {
            System.out.println("Your name is too long.");
        }

    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()==10){
            this.phoneNumber = phoneNumber;
            System.out.println(this.phoneNumber);

        }else{
            System.out.println("You entered a wrong phone number.");
        }

    }

    public void setAge(int age) {
        if(age>=18){
            this.age = age;
            System.out.println(this.age);
        }else{
            System.out.println("You are too young to open an account.");
        }

    }

    public void setSSN(String ssn) {
        if(ssn.length()==9){
            this.ssn = ssn;
            System.out.println(this.ssn);

        }else{
            System.out.println("You entered a wrong social security number.");
        }

    }

    public void setPassword(String password) {
        if(password.contains("#@$")){
            this.age = age;
            System.out.println(this.age);
        }else{
            System.out.println("Your password is not strong.");
        }

    }
}

class Tester{
    public static void main(String[] args) {

        MasoudWahab masoudWahab = new MasoudWahab();
        masoudWahab.setName("Masoud");
        masoudWahab.setPhoneNumber("9254567654");
        masoudWahab.setAge(18);
        masoudWahab.setSSN("123456789");
        masoudWahab.setPassword("#@$Ahmad");

    }
}



