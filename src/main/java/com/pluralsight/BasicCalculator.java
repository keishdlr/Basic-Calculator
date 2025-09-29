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

        myScanner.nextLine(); // Buffer: eats the new line

        // Ask the user for the operator
        System.out.println("Possible Calculations \n" + "\t(A) Add \n" + "\t(S) subtract \n" + "\t(M) Multiply \n" + "\t(D) Divide \n");

        //Store what action is chosen
        System.out.println("Please select and option");
        String action = myScanner.nextLine();
        double result = 0; //initializing the variable
        String operator = "";

        //if -else menu select
        if (action.equals ("a")){
             result = num1 + num2;
            System.out.println(num1 + operator + num2 + " = " + result);}
            else if (action.equals("s")){
             result = num1 - num2;
            System.out.println(num1 + operator + num2 + " = " + result);}
            else if (action.equals("m")){
             result = num1 * num2;
            System.out.println(num1 + operator + num2 + " = " + result);}
            else if (action.equals("d")){
             result = num1 / num2;
            System.out.println(num1 + operator + num2 + " = " + result);}
            else{
            System.out.println("Not a valid option: Try again");}

        System.out.println(" The result of " + num1 + operator + num2 + " is " + result);

        }
    }


