package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;

/**
 * Even Fibonacci numbers.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=2">Project Euler problem 2</a>
 */
public class Problem002 implements Solvable {
    @Override
    public String solve() {
        int sumOfEvenTerms = 0;
        int previous = 1;
        int current = 2;

        while (current < 4_000_000) {
            if (current % 2 == 0) {
                sumOfEvenTerms += current;
            }

            int next = previous + current;
            previous = current;
            current = next;
        }

        return Integer.toString(sumOfEvenTerms);
    }
}
