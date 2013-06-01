package be.vandemalle.jasper.project.euler;

import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

/**
 * Solution to Project Euler problem 12.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=12">http://projecteuler.net/problem=12</a>
 * 
 */
public class Problem012 implements Solvable {
	/** The Constant FIRST_500_PRIMES. */
	private static final int[] FIRST_500_PRIMES = PrimeUtils.sieveOfAtkin(3571);

	/** {@inheritDoc} */
	@Override
	public String solve() {
		long triangNum = 0;
		for (int i = 1;; i++) {
			triangNum += i;

			// TODO: count divisors needs optimisation
			if (countDivisors(triangNum) > 500) {
				break;
			}
		}

		return Long.toString(triangNum);
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
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem012().solve());
	}
}