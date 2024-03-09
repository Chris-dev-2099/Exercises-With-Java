package Exercises_12_17;

import java.util.Arrays;
/* 12. Write a program that finds the product
of all even numbers in a vector of integers.*/

public class Exercise12 {
    public static void main(String[] args){
        System.out.println("_____PRODUCT ELEMENT PARES_____");
            int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Even numbers in the vector: ");
        Arrays.stream(vector)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println); // Go through the filtered flow and for each element (number) execute the println method
    }
}
