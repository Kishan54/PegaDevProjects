package org.example;

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

        float totalLength = 15.45f;
        float totalWidth = 3.50f;

        String colourCategoryOfPaint = "Pastel"; // Basic, Pastel, Vibrant
        String typeOfPaint = "Gloss"; // Gloss, Matte, Satin

        float totalArea = getArea(totalLength, totalWidth);
        float totalLitres = getTotalLitres(totalArea);
        float pricePerLitre = getPrice(colourCategoryOfPaint, typeOfPaint);
        double totalCost = getTotalCost(totalLitres, pricePerLitre);
        System.out.println("£" + (Math.round(totalCost * 100.0) / 100.0));
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
        //type of paint
        float price = 0.00f;
        switch (colourCat) {
            case "Gloss":
                price = 3.99f;
            case "Matte":
                price = 4.49f;
            case "Satin":
                price = 4.74f;
            default:
                price = 0.00f;
        }
        //colour category
        if (type == "Basic") {
            price *= 1;
        } else if (type == "Pastel") {
            price *= 1.25;
        } else {
            price *= 1.35;
        }
        return (price);
    }

    public static float getTotalCost (float totalLitres, float price){
        return price*totalLitres;
    }
}