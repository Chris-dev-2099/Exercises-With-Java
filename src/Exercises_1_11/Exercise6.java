package Exercises_1_11;

import java.util.Scanner;

/* 6. Asterisk Pattern Generation Exercise:
Write a Java program that prompts the user to enter a positive integer.
Then, display an asterisk pattern like the following example, where each row has the
same number of asterisks as the number entered:
Example: Hint: You can use a For loop and the line break character \n
If the user enters 4:
*
**
***
****

*/

public class Exercise6 {

    public static void main(String[] args) {

        System.out.println("Enter a positive integer different from 0:");
        Scanner scanner = new Scanner(System.in); ;
        Integer number = scanner.nextInt() ;
        scanner.close();
        if (number > 0) {
            for (int i = 0 ; i <= number - 1 ; i++){
                System.out.print("\n" );
                for(int j = 0 ; j <= i ; j++){
                    System.out.print("* ");
                }
            }
        }else{
            System.out.println("You must enter a positive integer different from 0 - Try again");
        }
    }
    
}
