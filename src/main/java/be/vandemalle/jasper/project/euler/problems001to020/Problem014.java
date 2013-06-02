package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.ProblemTester;

/**
 * Solution to Project Euler problem 14.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=14">http://projecteuler.net/problem=14</a>
 */
public class Problem014 extends ProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "837799";

	/** The Constant ONE_MILLLION. */
	private static final int ONE_MILLLION = 1_000_000;

	/** The Constant TERM_COUNT_CACHE. */
	private static final int[] TERM_COUNT_CACHE = new int[ONE_MILLLION / 2];

	/** {@inheritDoc} */
	@Override
	public String solve() {
		int maxTermCount = 0;
		int numberWithMaxTerms = 0;

		for (int i = 1; i < ONE_MILLLION; i++) {
			int termCount = getCollatzTermCount(i);

			if (termCount > maxTermCount) {
				maxTermCount = termCount;
				numberWithMaxTerms = i;
			}
		}

		return Integer.toString(numberWithMaxTerms);
	}

	/**
	 * Gets the Collatz term count.
	 * 
	 * @param sequenceStart the sequence start
	 * @return the Collatz term count
	 */
	private static int getCollatzTermCount(long sequenceStart) {
		int termCount = 0;

		// check cached values
		if (sequenceStart < TERM_COUNT_CACHE.length) {
			termCount = TERM_COUNT_CACHE[(int) sequenceStart - 1];
		}

		if (termCount != 0) {
			return termCount;
		}

		if (sequenceStart == 1) {
			termCount = 1;
		} else if (sequenceStart % 2 == 0) {
			termCount = getCollatzTermCount(evenCollatz(sequenceStart)) + 1;
		} else {
			termCount = getCollatzTermCount(oddCollatz(sequenceStart)) + 1;
		}

		// put the result in the cache
		if (sequenceStart < TERM_COUNT_CACHE.length) {
			TERM_COUNT_CACHE[(int) sequenceStart - 1] = termCount;
		}

		return termCount;
	}

	/**
	 * The even Collatz function.
	 * 
	 * @param n the current Collatz term
	 * @return the next Collatz term
	 */
	private static long evenCollatz(long n) {
		return n / 2;
	}

	/**
	 * The odd Collatz function.
	 * 
	 * @param n the current Collatz term
	 * @return the next Collatz term
	 */
	private static long oddCollatz(long n) {
		return n * 3 + 1;
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}