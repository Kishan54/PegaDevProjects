package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String[] paintCategories = {"Basic", "Pastel", "Vibrant"};
        String[] paintTypes = {"Gloss", "Matte", "Satin"};
        String[] paintColours = {"White", "Black", "Red", "Blue", "Green", "Yellow", "Purple", "Pink", "Brown"};

        int userInput;
        boolean quitConfirmed = false;
        System.out.println("\nHello! Welcome to Kishy's Paint Calculator :)");
        do {
            System.out.println("\nPlease choose an option: " +
                    "\n1 - Display Colours " +
                    "\n2 - Display Types " +
                    "\n3 - Display Categories " +
                    "\n4 - Find Price " +
                    "\n5 - Quit " +
                    "\nChoose your option (1-3):");
            userInput = myObj.nextInt();
            if (userInput == 1) {
                System.out.println("All colours available: ");
                for (String colour : paintColours){
                    System.out.println("- " + colour);
                }
            } else if (userInput == 2) {
                System.out.println("All types available: ");
                for (String type : paintTypes){
                    System.out.println("- " + type);
                }
            } else if (userInput == 3) {
                System.out.println("All categories available: ");
                for (String cat : paintCategories){
                    System.out.println("- " + cat);
                }
            } else if (userInput == 4) {
                System.out.println("Enter total Length:");
                float totalLength = myObj.nextFloat(); //15.45f;

                System.out.println("Enter total Width:");
                float totalWidth = myObj.nextFloat(); //3.50f;

                System.out.println("Category Options: \n1 - Basic \n2 - Pastel \n3 - Vibrant \nChoose your option (1-3):");
                int colourCategoryOfPaint = myObj.nextInt();

                System.out.println("Type Options: \n1 - Gloss \n2 - Matte \n3 - Satin \nChoose your option (1-3):");
                int typeOfPaint = myObj.nextInt();

                float totalArea = getArea(totalLength, totalWidth);
                float totalLitres = getTotalLitres(totalArea);

                float pricePerLitre = getPrice(colourCategoryOfPaint, typeOfPaint);
                double totalCost = getTotalCost(totalLitres, pricePerLitre);

                System.out.println("The total price is: £" + (Math.round(totalCost * 100.0) / 100.0));
            } else if (userInput == 5) {
                quitConfirmed = true;
            } else {
                System.out.println("\nError - Try again");
            }
        } while (quitConfirmed == false);
        System.out.println("Thank you for using Kishy's Paint Calculator");
    }

    public static float getArea (float length, float width){
        return (length*width);
    }
    public static float getTotalLitres (float area){
        float metreSquaredPerLitre = 15.50f; // Fixed
        float amount = area/metreSquaredPerLitre;
        return amount;
    }

    public static float getPrice (int colourCat, int type){


        float price;
        switch (type) {
            case (1):
                price = 3.99f;
                break;
            case (2):
                price = 4.49f;
                break;
            case (3):
                price = 4.74f;
                break;
            default:
                price = 3.00f;
        }

        if (colourCat == 1) {
            price *= 1;
        } else if (colourCat == 2) {
            price *= 1.25;
        } else if (colourCat == 3){
            price *= 1.35;
        } else {
            price *= 1;
        }
        return (price);
    }

    public static float getTotalCost (float totalLitres, float price){
        return price*totalLitres;
    }
}