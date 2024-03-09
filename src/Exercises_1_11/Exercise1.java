package Exercises_1_11;

import java.util.Scanner;

/* 1. Leap Year Verification Exercise:
Create a Java program that prompts the user to enter a year and determines if it is a year
leap year or not. A leap year is one divisible by 4, except those divisible by 100.
but not by 400. For example, 2000 and 2400 are leap years, while 1800, 1900
and 2100 are not.*/

public class Exercise1 {
    public static void main(String[] args) {
        Scanner yearToEvaluate = new Scanner(System.in);

        System.out.println("Enter a year to find out if it is a leap year or not: ");
        int year = yearToEvaluate.nextInt(); 

        yearToEvaluate.close();
        
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year " + year + " is a leap year");
        }else {
            System.out.println("The year " + year + " is not a leap year");
        }
    }
}
