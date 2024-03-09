package Exercises_12_17;
import java.util.*;

/* 14. Write a program that removes the elements
duplicates of a list.*/

public class Exercise14 {
    public static void main(String[] args){
        System.out.println("_____REMOVE DUPLICATE_____");
        List<Integer> listarr = Arrays.asList(1, 4, 4, 2, 3, 5, 5, 6, 7, 8, 9, 10);
        HashSet<Integer> whole = new HashSet<>(listarr); // This code demonstrates how to remove duplicate elements from a list in Java using a HashSet.
        List<Integer> noDuplicateList = new ArrayList<>(whole);

        System.out.println("Original list: " + listarr);
        System.out.println("Duplicate list: " + noDuplicateList);
    }

}
