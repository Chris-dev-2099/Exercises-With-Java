package Exercises_1_11;

import java.util.Scanner;

/* 10. Exercise on Calculating Repeated Digits in a Number:
Develop a Java program that asks the user to enter a positive integer and
a digit, and then count and show how many times that digit appears in the number
joined. */

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        Integer numberInteger = scanner.nextInt();

        System.out.println("Enter a single digit number: ");
        Integer oneDigit = scanner.nextInt();
        
        scanner.close();

        String numberIntString = numberInteger.toString() ;

        Integer counter = 0 ;

        for (int i = 0; i < numberIntString.length(); i++){
            int digitExtrac = Character.getNumericValue(numberIntString.charAt(i));
            if (oneDigit == digitExtrac) {
                counter ++ ;
            }
        }

        System.out.println("The entered digit is repeated " + counter + " times in the whole number");

    }
}
