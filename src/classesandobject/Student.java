package classesandobject;

public class Student {

    public int id;
    public String name;
    public String dob;
    public String email;
    public String grade;

    public Student() { // this is default constructor - this is automatically created whenever a class is created, if we add it manually class will not create it
    }

    public Student(int id, String name, String dob, String email, String grade) { // parameterised constructor
        this.id = id; // this is used for current class variables
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.grade = grade;
    }

    // it converts object into string format
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

}
