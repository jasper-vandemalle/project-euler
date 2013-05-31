package be.vandemalle.jasper.project.euler;

import java.math.BigInteger;

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

	/** The Constant TWO. */
	private static final BigInteger TWO = BigInteger.valueOf(2);

	/** The Constant THREE. */
	private static final BigInteger THREE = BigInteger.valueOf(3);

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
		long n = sequenceStart;
		int termCount = 1;

		do {
			// test the first bit to check if n is even
			if (n % 2 == 0) {
				n = evenCollatz(n);
			} else {
				n = oddCollatz(n);
			}
			termCount++;
		} while (n > 1);

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