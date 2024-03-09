package Exercises_12_17;
import java.util.HashMap;
import java.util.List;

/* 17. Write a program that takes a HashMap where the keys are names of
students and the values are lists of grades, and calculate the grade point average
for each student.*/

public class Exercise17 {
    public static void main(String[] args) {
        // We create a HashMap to store the ratings
        HashMap<String, List<Integer>> ratings = new HashMap<>();

        // We added some examples of students and grades
        ratings.put("Juan", List.of(10, 8, 9));
        ratings.put("María", List.of(9, 7, 10));
        ratings.put("Pedro", List.of(8, 9, 8));

        // We go through the HashMap to calculate the average for each student
        for (String studentName : ratings.keySet()) {
            List<Integer> notesStudent = ratings.get(studentName);
            int sumNotes = 0;
            for (int note : notesStudent) {
                sumNotes += note;
            }
            double average = sumNotes / notesStudent.size();

            // We print the student's name and their average
            System.out.println("Student: " + studentName);
            System.out.println("Average: " + average);
            System.out.println();
        }
    }
}
