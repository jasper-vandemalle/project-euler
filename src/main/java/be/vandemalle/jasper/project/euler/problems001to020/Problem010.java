package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.ProblemTester;
import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

/**
 * Solution to Project Euler problem 10.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=10">http://projecteuler.net/problem=10</a>
 */
public class Problem010 extends ProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "142913828922";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		int[] primes = PrimeUtils.sieveOfAtkin(2_000_000 - 1);
		long sumOfPrimes = 0;

		for (int prime : primes) {
			sumOfPrimes += prime;
		}

		return Long.toString(sumOfPrimes);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}