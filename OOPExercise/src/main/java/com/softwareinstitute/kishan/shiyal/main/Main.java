package com.softwareinstitute.kishan.shiyal.main;

import com.softwareinstitute.kishan.shiyal.animal.Animal;
import com.softwareinstitute.kishan.shiyal.animal.Cat;
import com.softwareinstitute.kishan.shiyal.animal.Dog;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        boolean breakingLoop = false;
        int userInput;
        ArrayList<Animal> animals = new ArrayList<Animal>();

        System.out.println("Hello world!");
        Animal a = new Cat();
        a.setAge(5);
        a.setName("Miles");
        Animal b = new Cat();
        b.setAge(8);
        b.setName("Katie");
        Animal c = new Dog();
        c.setAge(12);
        c.setName("Leo");

        animals.add(a);
        animals.add(b);
        animals.add(c);

        do {
            System.out.println("\nPlease choose an option: " +
                    "\n1 - Display Animals " +
                    "\n2 - Add Animal " +
                    "\n3 - Quit " +
                    "\nChoose your option (1-3):");
            userInput = myObj.nextInt();
            if (userInput == 1){
                displayAnimals(animals);
            } else if (userInput == 2) {
                addAnimal()
                Animal temp;

                String inputAnimalName;
                int inputAnimalAge;
                int inputAnimalClass;

                System.out.println("Which Animal to add: " +
                        "\n1 - Dog" +
                        "\n2 - Cat");
                inputAnimalClass = myObj.nextInt();
                System.out.println("Enter animal name: ");
                inputAnimalName = myObj.next();
                System.out.println("Enter animal age: ");
                inputAnimalAge = myObj.nextInt();

                if (inputAnimalClass == 1) {
                    temp = new Dog();
                    temp.setName(inputAnimalName);
                    temp.setAge(inputAnimalAge);
                    animals.add(temp);
                } else if (inputAnimalClass == 2) {
                    temp = new Cat();
                    temp.setName(inputAnimalName);
                    temp.setAge(inputAnimalAge);
                    animals.add(temp);
                }
            } else if (userInput == 3) {
                breakingLoop = true;
            }
        } while (breakingLoop == false);
    }

    public static void displayAnimals (ArrayList<Animal> animals){
        System.out.println("All Animals: ");
        if (animals.size() == 0) {
            System.out.println("No Animals");
        } else {
            for (Animal animal : animals){
                System.out.println("\nAnimal: " + animal.getClass().getSimpleName() +
                        "\nName: " + animal.getName() +
                        "\nAge: " + animal.getAge());
            }
        }
    }
}