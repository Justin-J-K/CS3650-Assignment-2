/*
 * Justin Kim
 * CS 3560
 * Assignment 2
 * Question 5e
 */
package question5e;

public class Professor extends Employee {
    private String field;

    public Professor(String name, int hours, String field) {
        super(name, hours);
        this.field = field;
    }

    @Override
    public double calculateSalary() {
        return getHours() * 30;
    }
}
