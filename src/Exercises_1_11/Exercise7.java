package Exercises_1_11;

import java.util.Scanner;

/* 7. Number Ordering Exercise (without using arrays):
Create a Java program that prompts the user to enter three integers.
Then, display the numbers in ascending order, using conditionals to determine
which is the largest, the intermediate and the smallest. */


public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("---- Ordering of numbers ----");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        Integer number1  = scanner.nextInt() ; 

        System.out.println("Enter a second number: ");
        Integer number2 = scanner.nextInt() ;

        System.out.println("Enter a third and final number: ");
        Integer number3 = scanner.nextInt() ;

        scanner.close();

        Integer firstnumb = 0 ;
        Integer secondnumb = 0 ;
        Integer thirdnumb = 0 ;

       
        if (number1 < number2 && number1 < number3) {
            firstnumb = number1;
            if (number2 > number3) {
                secondnumb = number3;
                thirdnumb = number2;
            }else{
                secondnumb = number2 ;
                thirdnumb = number3 ;
            }
        }else if (number2 < number1 && number2 < number3) {
            firstnumb = number2;
            if (number1 > number3) {
                secondnumb = number3;
                thirdnumb = number1;
            }else{
                secondnumb = number1 ;
                thirdnumb = number3 ;
            }
        }else{
            firstnumb = number3;
            if (number2 > number1) {
                secondnumb = number1;
                thirdnumb = number2;
            }else{
                secondnumb = number2 ;
                thirdnumb = number1 ;
            }
        }

        System.out.println("The order of the numbers entered in ascending order is: "+ firstnumb +" , "+ secondnumb +" , "+thirdnumb);
        

    }
    
}
