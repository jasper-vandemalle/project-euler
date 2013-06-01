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
}
