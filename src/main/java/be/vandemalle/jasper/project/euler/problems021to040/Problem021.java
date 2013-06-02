package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;

/**
 * Solution to Project Euler problem 21.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=21">http://projecteuler.net/problem=21</a>
 */
public class Problem021 extends AbstractProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "31626";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		int sumOfAmicableNumbers = 0;
		for (int i = 1; i < 10_000; i++) {
			if (isAmicable(i)) {
				sumOfAmicableNumbers += i;
			}
		}
		return Integer.toString(sumOfAmicableNumbers);
	}

	/**
	 * Check if a number is amicable.
	 * 
	 * @param n the number to check
	 * @return <code>true</code> if amicable, <code>false</code> otherwise
	 * @see <a href="https://en.wikipedia.org/wiki/Amicable_numbers">https://en.wikipedia.org/wiki/Amicable_numbers</a>
	 */
	private static boolean isAmicable(int n) {
		int m = getSumOfDivisorsSum(n);
		return m != n && getSumOfDivisorsSum(m) == n;
	}

	/**
	 * Get the sum of all proper divisors (no remainder) of a number.
	 * 
	 * @param n the number
	 * @return the sum of all proper divisors
	 */
	private static int getSumOfDivisorsSum(int n) {
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		return sum;
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}