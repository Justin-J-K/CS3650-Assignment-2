/*
 * Justin Kim
 * CS 3560
 * Assignment 2
 * Question 5f
 */
package question5f;

public class Magazine implements SaleableItem {
    public Magazine() {
        super();
    }

    @Override
    public void sellCopy() {
        System.out.println("Selling a magazine");
    }
}
