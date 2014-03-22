package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;
import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

import java.util.List;

/**
 * Solution to Project Euler problem 3.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=3">http://projecteuler.net/problem=3</a>
 */
public class Problem003 extends AbstractProblemTester {
    /**
     * The Constant ANSWER.
     */
    private static final String ANSWER = "6857";

    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        Long number = 600_851_475_143L;
        List<Integer> primes = PrimeUtils.sieveOfAtkinAsList(30_000);

        while (!primes.contains(number.intValue())) {
            for (Integer prime : primes) {
                if (number % prime == 0) {
                    number = number / prime;
                    break;
                }
            }
        }

        return Long.toString(number);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAnswer() {
        return ANSWER;
    }
}
