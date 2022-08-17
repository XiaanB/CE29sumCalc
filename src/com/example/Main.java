package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter 2 numbers: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("You have entered #: " + num1 + " and #: " + num2);

        simpleCalculator calc = new simpleCalculator(num1, num2);
        System.out.println("Add.." + calc.getAdditionResults());
        System.out.println("Sub.." + calc.getSubtractionResults());
        System.out.println("div.." + calc.getDivisionResults());
        System.out.println("mult.." + calc.getMultiplicationResults());
    }
}
