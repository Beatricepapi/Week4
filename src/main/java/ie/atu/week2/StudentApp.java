package ie.atu.week2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students do you want to enter?");
        int count = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        int i = 0;
        while (i < count) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.println("Enter name: ");
            String name = sc.nextLine();

            //Prevent duplicate email
            String email;
            while (true) {
                System.out.println("\nEnter email: ");
                email = sc.nextLine().trim().toLowerCase(); // Normalise case + trim

                if (emailExists(students, email)) {
                    System.out.println("Email already exists! Please enter a different one.");
                } else {
                    break; //email is unique
                }
            }

            System.out.println("Enter course: ");
            String course = sc.nextLine();

            Student s = new Student(name, email, course);
            students.add(s);
            i++;
        }

        // Print all students
        System.out.println("\nStudent list:");
        for (Student s : students) {
            System.out.println(s); // uses Student.toString()
        }

        sc.close();
    }

    //Helper method to check for duplicate emails
    private static boolean emailExists(ArrayList<Student> students, String email) {
        for (Student s : students) {
            if (s.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
}