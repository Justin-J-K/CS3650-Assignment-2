/*
 * Justin Kim
 * CS 3560
 * Assignment 2
 * Question 5e
 */
package question5e;

public class Staff extends Employee {
    private int role;

    public Staff(String name, int hours, int role) {
        super(name, hours);
        this.role = role;
    }
}
