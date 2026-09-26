package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;

/**
 * Multiples of 3 or 5.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=1">Project Euler problem 1</a>
 */
public class Problem001 implements Solvable {
    @Override
    public String solve() {
        int sumOfMultiples = 0;

        for (int i = 0; i < 1_000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumOfMultiples += i;
            }
        }

        return Integer.toString(sumOfMultiples);
    }
}
