package be.vandemalle.jasper.project.euler;

/**
 * Solution to Project Euler problem 14.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=14">http://projecteuler.net/problem=14</a>
 * 
 */
public class Problem014 implements Solvable {
	/** The Constant ONE_MILLLION. */
	private static final int ONE_MILLLION = 1_000_000;

	/** {@inheritDoc} */
	@Override
	public String solve() {
		int maxTermCount = 0;
		int numberWithMaxTerms = 0;

		// TODO: optimise by caching terms (and/or term counts)
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
		int termCount = 1;

		if (sequenceStart == 1) {
			termCount = 1;
		} else if (sequenceStart % 2 == 0) {
			termCount = getCollatzTermCount(evenCollatz(sequenceStart)) + 1;
		} else {
			termCount = getCollatzTermCount(oddCollatz(sequenceStart)) + 1;
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

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem014().solve());
	}
}