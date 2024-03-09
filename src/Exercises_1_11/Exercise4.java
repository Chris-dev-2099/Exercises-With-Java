package Exercises_1_11 ;

import java.util.Scanner;

/*4. Compound Interest Calculation Exercise:
Develop a Java program that allows you to calculate the final amount of an investment
after a certain number of years, using the compound interest formula. He
program should ask the user to enter the initial amount invested, the annual interest rate
and the number of years. Then, it shows the final amount.*/

// Formula: A = P. (1+r)to n
// A = final amount - P = initial investment - r = interest rate in decimal terms (for example, 5% would be expressed as 0.05) - n = number of years


public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("-------- Final Investment Amount Calculator --------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial amount invested:");
        double initialInvestment = scanner.nextDouble();

        System.out.println("Enter the annual interest rate in percentage (without the % sign):");
        double interestRate = scanner.nextDouble();

        System.out.println("Ingrese el número de años de la inversión:");
        double nYears = scanner.nextDouble();

        scanner.close(); 

        double investmentFinal = initialInvestment * Math.pow(( 1 + (interestRate/100)), nYears );

        System.out.println("Your final investment gives a total of: " + investmentFinal);

    }
    
}
