/*
 * Justin Kim
 * CS 3560
 * Assignment 2
 * Question 5f
 */
package question5f;

public class Ticket implements SaleableItem {
    public Ticket() {
        super();
    }

    @Override
    public void sellCopy() {
        System.out.println("Selling a ticket");
    }
}
