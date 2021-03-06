package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;
import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

/**
 * Solution to Project Euler problem 12.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=12">http://projecteuler.net/problem=12</a>
 */
public class Problem012 extends AbstractProblemTester {
    /**
     * The Constant ANSWER.
     */
    private static final String ANSWER = "76576500";

    /**
     * The Constant FIRST_500_PRIMES.
     */
    private static final int[] FIRST_500_PRIMES = PrimeUtils.sieveOfAtkin(3571);

    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        long triangleNum = 0;
        for (int i = 1; ; i++) {
            triangleNum += i;

            if (countDivisors(triangleNum) > 500) {
                break;
            }
        }

        return Long.toString(triangleNum);
    }

    /**
     * Count the divisors for a certain number.
     *
     * @param n the number
     * @return the amount of divisors
     * @see <a href="http://en.wikipedia.org/wiki/Prime_factor">http://en.wikipedia.org/wiki/Prime_factor</a>
     */
    private static int countDivisors(long n) {
        int count = 1;
        int exponent;
        long remainder = n;

        for (int prime : FIRST_500_PRIMES) {
            if (prime * prime > n) {
                return count * 2;
            }

            exponent = 1;
            while (remainder % prime == 0) {
                exponent++;
                remainder /= prime;
            }
            count *= exponent;

            if (remainder == 1) {
                return count;
            }
        }

        return count;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAnswer() {
        return ANSWER;
    }
}
