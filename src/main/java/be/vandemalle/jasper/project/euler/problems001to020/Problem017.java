package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.ProblemTester;

/**
 * Solution to Project Euler problem 17.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=17">http://projecteuler.net/problem=17</a>
 */
public class Problem017 extends ProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "21124";

	/** The Constant AND. */
	private static final String AND = "and";
	/** The Constant HUNDRED. */
	private static final String HUNDRED = "hundred";
	/** The Constant THOUSAND. */
	private static final String THOUSAND = "thousand";

	/** The Constant ZERO_TO_NINE. */
	private static final String[] ZERO_TO_NINE = { "zero", "one", "two", "three", "four", "five", "six", "seven",
			"eight", "nine" };
	/** The Constant TEN_TO_NINETEEN. */
	private static final String[] TEN_TO_NINETEEN = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
			"sixteen", "seventeen", "eighteen", "nineteen" };
	/** The Constant TENS. */
	private static final String[] TENS = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	/** {@inheritDoc} */
	@Override
	public String solve() {
		int sumOfLetters = 0;
		for (int i = 1; i <= 1_000; i++) {
			sumOfLetters += convertToWrittenEnglish(i).length();
		}
		return Integer.toString(sumOfLetters);
	}

	/**
	 * Convert a number to written English.
	 * 
	 * @param i the number to convert
	 * @return the English conversion of the number
	 * @see <a href="http://en.wikipedia.org/wiki/English_numerals">http://en.wikipedia.org/wiki/English_numerals</a>
	 */
	private String convertToWrittenEnglish(int i) {
		if (i < 100) {
			return convertToWrittenEnglishZeroToNinetynine(i);
		} else {
			StringBuffer sb = new StringBuffer();

			if (i >= 1_000) {
				sb.append(convertToWrittenEnglishZeroToNinetynine(i / 1_000));
				sb.append(THOUSAND);
			}
			if (i / 100 % 10 != 0) {
				sb.append(ZERO_TO_NINE[i / 100 % 10]);
				sb.append(HUNDRED);
			}

			if (i % 100 != 0) {
				sb.append(AND);
				sb.append(convertToWrittenEnglishZeroToNinetynine(i % 100));
			}

			return sb.toString();
		}
	}

	/**
	 * Convert a number (within [0 9]) to written English.
	 * 
	 * @param n the n
	 * @return the English conversion of the number
	 * @see <a href="http://en.wikipedia.org/wiki/English_numerals">http://en.wikipedia.org/wiki/English_numerals</a>
	 */
	private static String convertToWrittenEnglishZeroToNinetynine(int n) {
		if (n < 10) {
			return ZERO_TO_NINE[n];
		} else if (n < 20) {
			return TEN_TO_NINETEEN[n - 10];
		} else {
			StringBuffer sb = new StringBuffer();
			sb.append(TENS[n / 10 - 2]);

			if (n % 10 != 0) {
				sb.append(ZERO_TO_NINE[n % 10]);
			}
			return sb.toString();
		}
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}