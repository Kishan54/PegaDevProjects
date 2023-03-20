package com.softwareinstitute.kishan.shiyal.main;

import com.softwareinstitute.kishan.shiyal.animal.Animal;
import com.softwareinstitute.kishan.shiyal.animal.Cat;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Cat a = new Cat();
        a.setAge(5);
        a.setName("Miles");
        System.out.println(a.getName() + " ");
        System.out.println(a.Sound() + " " +  a.Sleep());

    }
}