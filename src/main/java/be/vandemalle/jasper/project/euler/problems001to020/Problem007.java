package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

/**
 * Solution to Project Euler problem 7.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=7">http://projecteuler.net/problem=7</a>
 */
public class Problem007 implements Solvable {
    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        int[] primes = PrimeUtils.sieveOfAtkin((int) Math.pow(2, 17));
        return Integer.toString(primes[10_001 - 1]);
    }
}
