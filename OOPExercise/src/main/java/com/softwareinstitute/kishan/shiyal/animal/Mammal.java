package com.softwareinstitute.kishan.shiyal.animal;

public abstract class Mammal extends Animal {

    //////////////////////Attributes//////////////////
    private String name;
    private int age;

    //////////////////////Constructor/////////////////
    public Mammal() {
        super();
    }

    //////////////////////Methods/////////////////////
    public abstract String Sound();

}
