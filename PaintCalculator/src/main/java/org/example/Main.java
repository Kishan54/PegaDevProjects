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

        float totalLength = 0.00f;
        float totalWidth = 0.00f;

        float totalArea = getArea(totalLength, totalWidth);


        int totalCost = 0;
        System.out.println(totalCost);
    }

    public static float getArea (float length, float width){

        return (length*width);
    }
}