package com.softwareinstitute.kishan.shiyal.animal;

public class Cat extends Mammal {

    //////////////////////Attributes//////////////////
    private String name;
    private int age;

    //////////////////////Constructor/////////////////
    public Cat() {
        super();
    }

    //////////////////////Methods/////////////////////
    public String Sound() {
        return "Meow";
    }
}
