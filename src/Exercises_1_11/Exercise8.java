package Exercises_1_11;

import java.util.Random;
import java.util.Scanner;


/* 8. Random Number Generation with Addition Exercise:
Write a Java program that generates two random integers between 1 and 10 and
then ask the user to enter the sum of those two numbers. The program must verify
if the answer is correct.  */



public class Exercise8 {
    public static void main(String[] args){

        Random randomNumb = new Random();
        Integer randomNumber1 = randomNumb.nextInt(10) ;
        Integer randomNumber2 = randomNumb.nextInt(10) ;
        
        System.out.println("Sum of two random numbers: "+randomNumber1+" + "+ randomNumber2);
        
       Scanner scanner = new Scanner(System.in) ; 

        System.out.println("Enter the result of the displayed sum: ");
        Integer resultUser = scanner.nextInt();

        scanner.close();

        Integer resultaddition  = randomNumber1 + randomNumber2 ;

        if (resultaddition == resultUser){
            System.out.println("Correct!! The result of the sum is: " + resultUser);
        }else{
            System.out.println("Incorrect... the result of the sum is: " + resultaddition);
        }


    }
}
