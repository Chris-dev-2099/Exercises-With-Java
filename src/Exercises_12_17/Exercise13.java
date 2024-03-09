package Exercises_12_17;

/* 13. Write a program that finds the maximum element
into a vector of integers. that is, the largest number. */

public class Exercise13 {
    public static void main(String[] args) {
        System.out.println("_____ELEMENT MAX VECTOR_____");
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 87, 90};
        int max = Integer.MIN_VALUE;

        for (int number : vector) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The maximum element in the vector is: " + max);
    }
}
