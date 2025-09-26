package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Scanner " myScanner"  gets keyboard input
        Scanner myScanner = new Scanner(System.in);

        // Request for the user to enter the first number
        System.out.println("Enter the first number");

        double num1 = myScanner.nextDouble();

        // Request for the user to enter the second number
        System.out.println("Enter the second number");

        double num2 = myScanner.nextDouble();

        // Ask the user for the operator
        System.out.println("Possible Calculations \n" + "(A) Add \n" + "(S) subtract \n" + "(M) Multiply \n" + "(D) Divide \n");
        System.out.println("Please select and option");

        double result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);


    }

}
