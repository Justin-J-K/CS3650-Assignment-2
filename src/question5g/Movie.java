/*
 * Justin Kim
 * CS 3560
 * Assignment 2
 * Question 5g
 */
package question5g;

import java.util.List;

public class Movie {
    private String name;
    private String genre;
    private List<Watch> watches;

    public Movie(String name, String genre, List<Watch> watches) {
        this.name = name;
        this.genre = genre;
        this.watches = watches;
    }
}
