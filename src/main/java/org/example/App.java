/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String userInput;
        double temp;

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n");
        System.out.print("Your choice: ");
        userInput = input.next();

        if("c".compareTo(userInput) == 0 || "C".compareTo(userInput) == 0) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = input.nextDouble();
            System.out.printf("The temperature in Celsius is %.0f.", (temp - 32) * 5 / 9);
        }
        else {
            System.out.print("Please enter the temperature in Celsius: ");
            temp = input.nextDouble();
            System.out.printf("The temperature in Fahrenheit is %.0f.", temp * 9 / 5 + 32);
        }

    }
}
