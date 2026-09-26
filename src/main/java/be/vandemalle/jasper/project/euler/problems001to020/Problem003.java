package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;

/**
 * Largest prime factor.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=3">Project Euler problem 3</a>
 */
public class Problem003 implements Solvable {
    @Override
    public String solve() {
        long n = 600_851_475_143L;
        long largestFactor = 1;

        for (long factor = 2; factor * factor <= n; factor++) {
            while (n % factor == 0) {
                largestFactor = factor;
                n /= factor;
            }
        }

        // whatever is left after dividing out every factor up to its square root is prime
        return Long.toString(n > 1 ? n : largestFactor);
    }
}
