package ie.atu.week2;

public class Student {
    private String name;
    private String email;
    private String course;

    // Default constructor
    public Student(){
    }

    // Constructor with only name
    public Student(String name) {
        this.name = name;
    }

    // Constructor with all fields
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getters
}
