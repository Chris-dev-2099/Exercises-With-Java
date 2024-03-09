package Exercises_1_11;

import java.util.Scanner;

/* 5. Digit addition exercise:
Write a Java program that prompts the user to enter a positive integer.
Then, add all the digits of the number and display the result.
Example: User enters 12 → The program returns 3
SumDigits = 1+2= 3 .  */



public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type an Integer number :");
        Integer numbInteger = scanner.nextInt() ;

        scanner.close();

        String numbString = Integer.toString(numbInteger);
        Integer addition  = 0 ;

        for (int i = 0; i < numbString.length(); i++) {
            Integer oneDigit = Character.getNumericValue(numbString.charAt(i));
            addition += oneDigit ;
        }

        System.out.println("The sum of the digits of: "+ numbInteger +" is equal to : "+ addition  );



    }
}
