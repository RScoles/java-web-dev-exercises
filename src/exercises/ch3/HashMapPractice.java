package exercises.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String>  students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer  newStudentId;
        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student ID: ");
            newStudentId = input.nextInt();

            if (!newStudentId.equals("")) {
                System.out.print("Student's Name: ");
                String newStudentName = input.nextLine();
                students.put(newStudentId, newStudentName);

                input.nextLine();
            }
        } while(!newStudentId.equals(-1));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
