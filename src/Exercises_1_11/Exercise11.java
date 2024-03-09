package Exercises_1_11;


/* 11. Sum of elements:
Write a program that calculates the sum
of all elements in a vector of integers. */

public class Exercise11 {
    public static void main(String[] args) {
        
        int[] vector = {2, 15, 40, 28, 21};
        
        int addition = 0;
                    
        for (int i = 0; i < vector.length; i++) {
            addition += vector[i];
        }
            
        System.out.println("The sum of the elements in the vector is: " + addition );
       
    }
}
