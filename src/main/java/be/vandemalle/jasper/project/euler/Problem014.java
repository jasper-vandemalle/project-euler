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
	private static int getCollatzTermCount(int sequenceStart) {
		BigInteger n = BigInteger.valueOf(sequenceStart);
		int termCount = 1;

		do {
			// test the first bit to check if n is even
			if (!n.testBit(0)) {
				n = evenCollatz(n);
			} else {
				n = oddCollatz(n);
			}
			termCount++;
		} while (n.compareTo(BigInteger.ONE) >= 1);

		return termCount;
	}

	/**
	 * The even Collatz function.
	 * 
	 * @param n the current Collatz term
	 * @return the next Collatz term
	 */
	private static BigInteger evenCollatz(BigInteger n) {
		return n.divide(TWO);
	}

	/**
	 * The odd Collatz function.
	 * 
	 * @param n the current Collatz term
	 * @return the next Collatz term
	 */
	private static BigInteger oddCollatz(BigInteger n) {
		return n.multiply(THREE).add(BigInteger.ONE);
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