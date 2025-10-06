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

    // Getters and Setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getCourse() {return course;}
    public void setCourse(String course) {this.course = course;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
