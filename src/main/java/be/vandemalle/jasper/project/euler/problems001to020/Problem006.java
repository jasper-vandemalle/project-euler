package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;

/**
 * Solution to Project Euler problem 6.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=6">http://projecteuler.net/problem=6</a>
 */
public class Problem006 extends AbstractProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "25164150";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		int sumOfSquares = 0;
		int squareOfSum = 0;

		for (int i = 1; i <= 100; i++) {
			squareOfSum += i;
			sumOfSquares += (int) Math.pow(i, 2);
		}

		squareOfSum = (int) Math.pow(squareOfSum, 2);

		return Integer.toString(squareOfSum - sumOfSquares);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}