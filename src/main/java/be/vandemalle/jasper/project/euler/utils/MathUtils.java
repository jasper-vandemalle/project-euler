package be.vandemalle.jasper.project.euler.utils;

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

		for (char c : number.toCharArray()) {
			sumOfDigits += Character.digit(c, 10);
		}
		return sumOfDigits;
	}
}
