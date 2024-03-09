package Exercises_1_11 ;

import java.util.Scanner;

/*3. Currency Conversion Exercise:
Write a Java program that allows the user to convert an amount of money
from one currency to another. The program must ask the user to enter the amount of money
in one currency (e.g. dollars) and the exchange rate to the other currency (e.g.
euros). Then you need to perform the conversion and display the result.*/


public class Exercise3 {

    public static void main(String[] args){

        System.out.println("------- Dollars to Colombian Pesos Converter -------\f");
        Scanner typedUser = new Scanner(System.in);

        System.out.println("Enter the value in Dollars you want to convert:");
        double dollars = typedUser.nextDouble();

        typedUser.close();

        Double pesoValue = 3963.32 ;

        Double resultConvert = pesoValue*dollars;
        
        System.out.println("His conversion is "+ resultConvert +" Colombian pesos");

    }    
}
