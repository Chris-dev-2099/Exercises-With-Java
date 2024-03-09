package Exercises_12_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 15. Write a program that deletes all
the odd elements of a list.*/

public class Exercise15 {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); //list using asList method of Arrays class

            // Filter odd elements
            List<Integer> peerlessList = list.stream()//  Filters the data flow (stream) to select only the elements (number)
                    .filter(number -> number % 2 == 0)
                    .collect(Collectors.toList()); // Collects the elements from the filtered stream and converts them back into a list.

            System.out.println("List origin: " + list);
            System.out.println("peerless list: " + peerlessList);
        }

}
