/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double output;
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");
        String choice = input.nextLine().trim().toLowerCase();
        switch (choice) {
            case "c":
                System.out.print("Please enter the temperature in Fahrenheit: ");
                double f = input.nextDouble();
                output = convert.toC(f);
                System.out.printf("The temperature is %.1f in Celsius.", output);
                break;
            case "f":
                System.out.print("Please enter the temperature in Celsius: ");
                double c = input.nextDouble();
                output = convert.toF(c);
                System.out.printf("The temperature is %.1f in Fahrenheit.", output);
                break;
        }
    }
}
