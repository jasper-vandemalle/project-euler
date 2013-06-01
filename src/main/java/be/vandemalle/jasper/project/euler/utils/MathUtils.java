package be.vandemalle.jasper.project.euler.utils;

import java.math.BigInteger;

/**
 * Utility class for math related functions.
 * 
 * @author Jasper Vandemalle
 * 
 */
public class MathUtils {
	/**
	 * Count the sum of digits of a number.
	 * 
	 * @param number the number
	 * @return the sum of digits
	 */
	public static int countSumOfDigits(String number) {
		int sumOfDigits = 0;

		for (int i = 0; i < number.length(); i++) {
			sumOfDigits += getIntValueOnIndex(number, i);
		}
		return sumOfDigits;
	}

	/**
	 * Get the integer value on a certain index of a {@link String}.
	 * 
	 * @param string the string
	 * @param index the index
	 * @return the integer value
	 */
	public static int getIntValueOnIndex(String string, int index) {
		char c = string.charAt(index);

		if (!Character.isDigit(c)) {
			StringBuffer sb = new StringBuffer();
			sb.append("The character on index: '");
			sb.append(index);
			sb.append("' of string: '");
			sb.append(string);
			sb.append("' is not a digit");
			throw new IllegalArgumentException(sb.toString());
		}

		return Character.digit(c, 10);
	}

	/**
	 * Get the factorial (n!) of a certain number.
	 * 
	 * @param n n
	 * @return the factorial (n!)
	 * @see <a href="http://en.wikipedia.org/wiki/Factorial">http://en.wikipedia.org/wiki/Factorial</a>
	 */
	public static BigInteger factorial(long n) {
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
	 * Get the binomial coefficient for a certain n and k, also known as 'n choose k'.
	 * 
	 * @param n n
	 * @param k k
	 * @return the binomial coefficient (n choose k)
	 * @see <a
	 *      href="http://en.wikipedia.org/wiki/Binomial_coefficient">http://en.wikipedia.org/wiki/Binomial_coefficient</a>
	 */
	public static BigInteger binomialCoefficient(long n, long k) {
		return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
	}
}
