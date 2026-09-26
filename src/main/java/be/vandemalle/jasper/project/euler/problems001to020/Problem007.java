package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

/**
 * 10 001st prime.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=7">Project Euler problem 7</a>
 */
public class Problem007 implements Solvable {
    private static final int N = 10_001;

    @Override
    public String solve() {
        // the nth prime is smaller than n (ln n + ln ln n) for n >= 6
        int upperBound = (int) (N * (Math.log(N) + Math.log(Math.log(N))));
        int[] primes = PrimeUtils.sieveOfAtkin(upperBound);
        return Integer.toString(primes[N - 1]);
    }
}
