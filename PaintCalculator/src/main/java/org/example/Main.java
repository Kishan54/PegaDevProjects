package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // cost of paint x how much is needed
        /*
            the cost of paint is fixed so have variable amount (cost per litre or something)

            walls - total area = length x width so total length of all walls and total width of all walls

            find out how many litres needed for metre squared - this is fixed, so make variable

         */

        // use if else
        // use switch
        // different types of paint
        Scanner myObj = new Scanner(System.in);

        boolean valid = false;


            System.out.println("Enter Length:");
            float totalLength = myObj.nextFloat(); //15.45f;

            System.out.println("Enter Width:");
            float totalWidth = myObj.nextFloat(); //3.50f;

            System.out.println("Enter Category (Basic, Pastel, Vibrant):");
            String colourCategoryOfPaint = myObj.next(); //"Pastel"; // Basic, Pastel, Vibrant

            System.out.println("Enter Type of Paint (Gloss, Matte, Satin):");
            String typeOfPaint = myObj.next(); //"Matte"; // Gloss, Matte, Satin

            if (totalLength > 0 && totalWidth > 0 && colourCategoryOfPaint != "" && typeOfPaint != "") {
                valid = true;
            }




        float totalArea = getArea(totalLength, totalWidth);
        float totalLitres = getTotalLitres(totalArea);



        float pricePerLitre = getPrice(colourCategoryOfPaint, typeOfPaint);
        double totalCost = getTotalCost(totalLitres, pricePerLitre);


        System.out.println("The total price is: £" + (Math.round(totalCost * 100.0) / 100.0));
    }

    public static float getTotalLitres (float area){
        float metreSquaredPerLitre = 15.50f; // Fixed
        float amount = area/metreSquaredPerLitre;
        return amount;
    }

    public static float getArea (float length, float width){
        return (length*width);
    }

    public static float getPrice (String colourCat, String type){

        colourCat = colourCat.toLowerCase();
        type = type.toLowerCase();

        float price;
        switch (type) {
            case ("gloss"):
                System.out.println("Gloss Chosen");
                price = 3.99f;
                break;
            case ("matte"):
                System.out.println("Matte Chosen");
                price = 4.49f;
                break;
            case ("satin"):
                System.out.println("Satin Chosen");
                price = 4.74f;
                break;
            default:
                System.out.println("None Chosen");
                price = 3.00f;
        }

        System.out.println(colourCat);

        if (colourCat == "basic") {
            System.out.println("Basic Chosen");
            price *= 1;
        } else if (colourCat == "pastel") {
            System.out.println("Pastel Chosen");
            price *= 1.25;
        } else if (colourCat == "vibrant"){
            System.out.println("Vibrant Chosen");
            price *= 1.35;
        } else {
            System.out.println("None Chosen");
            price *= 1;
        }
        return (price);
    }

    public static float getTotalCost (float totalLitres, float price){
        return price*totalLitres;
    }
}