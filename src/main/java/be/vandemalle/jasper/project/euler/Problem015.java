package be.vandemalle.jasper.project.euler;

import java.math.BigInteger;

/**
 * Solution to Project Euler problem 15.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=15">http://projecteuler.net/problem=15</a>
 * 
 */
public class Problem015 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		BigInteger result = binomialCoefficient(40, 20);
		return result.toString();
	}

	/**
	 * Get the factorial (n!) of a certain number.
	 * 
	 * @param n
	 * @return the factorial (n!)
	 * @see <a href="http://en.wikipedia.org/wiki/Factorial">http://en.wikipedia.org/wiki/Factorial</a>
	 */
	private static BigInteger factorial(long n) {
		if (n < 0) {
			/**
			 * No negative factorials for now, implement the following later:
			 * http://en.wikipedia.org/wiki/Factorial#Extension_of_factorial_to_non-integer_values_of_argument
			 */
			throw new IllegalArgumentException("'n' can not be negative");
		}

		BigInteger prod = BigInteger.ONE;
		// 0! == 1! == 1, so start from 2
		for (long i = 2; i <= n; i++) {
			prod = prod.multiply(BigInteger.valueOf(i));
		}
		return prod;
	}

	/**
	 * Get the Binomial coefficient for a certain n and k, also known as 'n choose k'.
	 * 
	 * @param n
	 * @param k
	 * @return
	 * @see <a
	 *      href="http://en.wikipedia.org/wiki/Binomial_coefficient">http://en.wikipedia.org/wiki/Binomial_coefficient</a>
	 */
	public static BigInteger binomialCoefficient(long n, long k) {
		return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem015().solve());
	}
}