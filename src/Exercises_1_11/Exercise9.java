package Exercises_1_11;

import java.util.Scanner;

/*9. Greatest Common Factor (GCD) Calculation Exercise:
Develop a Java program that asks the user to enter two integers.
positives and then calculate and display their greatest common factor (GCD). */



public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("---- Greatest common divisor ----");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        Integer number1 = scanner.nextInt();

        System.out.println("Enter a second number: ");
        Integer number2 = scanner.nextInt();

        scanner.close();

        while (number2 != 0) {
            Integer temporaryNumber = number2;
            number2 = number1 % number2;
            number1 = temporaryNumber;
        }

        System.out.println("The Greatest Common Factor of the numbers entered is: "+ number1);
    }
}
