package ie.atu.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        // Holds all Student objects
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students do you want to enter?");
        int count = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        int i = 0;
        while (i < count) {
            System.out.println("\nEnter details for student " + (i+1) + ":");

            System.out.println("Enter name: ");
            String name = sc.nextLine();

            System.out.println("Enter email: ");
            String email = sc.nextLine();

            System.out.println("Enter course: ");
            String course = sc.nextLine();

            students.add(new Student(name, email, course));
            i++;
        }
        System.out.println("\nStudent list:");
        for (Student s : students) {
            System.out.println(s); // uses Student.toString()
        }

        sc.close();
    }
}
