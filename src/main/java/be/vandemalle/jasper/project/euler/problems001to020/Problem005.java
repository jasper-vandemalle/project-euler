package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;
import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

/**
 * Solution to Project Euler problem 5.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=5">http://projecteuler.net/problem=5</a>
 */
public class Problem005 extends AbstractProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "232792560";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		int solution = 1;
		int[] primes = PrimeUtils.sieveOfAtkin(20);

		for (int prime : primes) {
			int highestPower = 1;
			int primeDivisorWithHighestPowerUnderTwenty = 0;
			int primeDivisorWithHighestPower = 0;

			do {
				primeDivisorWithHighestPowerUnderTwenty = primeDivisorWithHighestPower;
				primeDivisorWithHighestPower = (int) Math.pow(prime, highestPower++);
			} while (primeDivisorWithHighestPower < 20);

			solution *= primeDivisorWithHighestPowerUnderTwenty;
		}

		return Integer.toString(solution);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}
