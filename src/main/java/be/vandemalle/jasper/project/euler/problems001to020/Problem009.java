package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;

/**
 * Special Pythagorean triplet.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=9">Project Euler problem 9</a>
 */
public class Problem009 implements Solvable {
    private static final int SUM = 1_000;

    @Override
    public String solve() {
        for (int a = 1; a < SUM / 3; a++) {
            for (int b = a + 1, c = SUM - a - b; b < c; b++, c--) {
                if (a * a + b * b == c * c) {
                    return Integer.toString(a * b * c);
                }
            }
        }

        throw new IllegalStateException("No Pythagorean triplet sums to " + SUM);
    }
}
