package org.example;

public class Main {
    public static void main(String[] args) {
        int x1 = 50;
        int y1 = 50;
        String output1 = "";
        output1 = (x1 == y1) ? "1" : ((x1 > y1) ? "2" : "3");
        System.out.println(output1);

        int x2 = 57;
        int y2 = 50;
        String output2 = "";
        output2 = (x2 == y2) ? "1" : ((x2 > y2) ? "2" : "3");
        System.out.println(output2);

        int x3 = 5;
        int y3 = 50;
        String output3 = "";
        output3 = (x3 == y3) ? "1" : ((x3 > y3) ? "2" : "3");
        System.out.println(output3);

    }
}