package com.softwareinstitute.kishan.shiyal.animal;

public class Dog extends Mammal {

    //////////////////////Attributes//////////////////
    private String name;
    private int age;

    //////////////////////Constructor/////////////////
    public Dog() {
        super();
    }

    //////////////////////Methods/////////////////////
    public String Sound() {
        return "Woof";
    }
}
