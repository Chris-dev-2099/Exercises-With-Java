package Exercises_12_17;
import java.util.HashMap;

/* 16. Delete keys:
Write a program that removes all keys from a HashMap
that have a value less than a given number.*/

public class Exercise16 {
        public static void main(String[] args) {
            System.out.println("_____DELETE PASSWORD HASHMAP_____");
            HashMap<String, Integer> map = new HashMap<>();
            map.put("password1", 10);
            map.put("password2", 5);
            map.put("password3", 15);
            map.put("password4", 20);

            int numberLimit = 10;

            // Delete keys with value less than the limit number
            map.entrySet().stream() //  to convert the set of map entries into a data stream.
                    .filter(entry -> entry.getValue() < numberLimit)
                    .forEach(entry -> map.remove(entry.getKey()));

            System.out.println("Original map: " + map);
        }

}
