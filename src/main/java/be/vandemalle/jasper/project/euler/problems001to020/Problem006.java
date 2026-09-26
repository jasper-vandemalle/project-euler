package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;

/**
 * Sum square difference.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=6">Project Euler problem 6</a>
 */
public class Problem006 implements Solvable {
    @Override
    public String solve() {
        int sum = 0;
        int sumOfSquares = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            sumOfSquares += i * i;
        }

        return Integer.toString(sum * sum - sumOfSquares);
    }
}
