package org.example;

public class Main {
    public static void main(String[] args) {
        String thanks = "Thank you, ";
        String name = "miguel!";
        String order = "Your order number is #";
        int previousOrder = 715;
        String OutputLine1 = thanks + name.toUpperCase();
        String OutputLine2 = order + (++previousOrder);
        System.out.println(OutputLine1);
        System.out.println(OutputLine2);

    }
}