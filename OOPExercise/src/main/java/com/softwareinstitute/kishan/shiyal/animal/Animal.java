package com.softwareinstitute.kishan.shiyal.animal;

public abstract class Animal {

    //////////////////////Attributes//////////////////
    private String name;
    private int age;

    //////////////////////Constructor/////////////////
    public Animal() {
        super();
    }

    //////////////////////Methods/////////////////////
    public abstract String Sound();

    public String Sleep() {
        return "zzz";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
