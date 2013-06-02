package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;

/**
 * Solution to Project Euler problem 1.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=1">http://projecteuler.net/problem=1</a>
 */
public class Problem001 extends AbstractProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "233168";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		int sumOfMultiples = 0;

		for (int i = 0; i < 1_000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sumOfMultiples += i;
			}
		}

		return Integer.toString(sumOfMultiples);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}