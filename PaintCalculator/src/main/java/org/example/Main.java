package org.example;

public class Main {
    public static void main(String[] args) {
        // cost of paint x how much is needed
        /*
            the cost of paint is fixed so have variable amount (cost per litre or something)

            walls - total area = length x width so total length of all walls and total width of all walls

            find out how many litres needed for metre squared - this is fixed, so make variable

         */

        float pricePerLitre = 5.99f;
        float litrePerMetreSquared = 0.20f;
        float totalLength = 15.45f;
        float totalWidth = 3.50f;

        float totalArea = getArea(totalLength, totalWidth);
        float totalCost = getTotalCost(totalArea, litrePerMetreSquared, pricePerLitre);
        
        System.out.println("£" + Math.round(totalCost));
    }

    public static float getArea (float length, float width){

        return (length*width);
    }

    public static float getTotalCost (float area, float litrePerMetreSquared, float pricePerLitre){

        return ((area * litrePerMetreSquared)*pricePerLitre);
    }
}