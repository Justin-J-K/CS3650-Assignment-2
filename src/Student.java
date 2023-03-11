/*
 * Justin Kim
 * CS 3560 
 * Assignment 2
 * Question 1
 */
public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Name: " + name + "\nMajor:" + major + "\nGPA: " + gpa;
    }

    public boolean equals(Student student) {
        return name.equals(student.getName()) &&
                major.equals(student.getMajor()) &&
                gpa == student.gpa;
    }
}
