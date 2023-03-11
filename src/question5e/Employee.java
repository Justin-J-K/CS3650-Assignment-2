/*
 * Justin Kim
 * CS 3560
 * Assignment 2
 * Question 5e
 */
package question5e;

public abstract class Employee {
    private String name;
    private int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public double calculateSalary() {
        return hours * 20;
    }

    public int getHours() {
        return hours;
    }
}
