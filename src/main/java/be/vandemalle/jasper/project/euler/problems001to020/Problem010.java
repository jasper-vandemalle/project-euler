package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.PrimeUtils;
import java.util.Arrays;

/**
 * Summation of primes.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=10">Project Euler problem 10</a>
 */
public class Problem010 implements Solvable {
    @Override
    public String solve() {
        int[] primes = PrimeUtils.sieveOfAtkin(2_000_000 - 1);
        long sumOfPrimes = Arrays.stream(primes).asLongStream().sum();
        return Long.toString(sumOfPrimes);
    }
}
