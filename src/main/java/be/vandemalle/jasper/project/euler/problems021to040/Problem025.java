package be.vandemalle.jasper.project.euler.problems021to040;

import java.math.BigInteger;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;

/**
 * Solution to Project Euler problem 25.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=25">http://projecteuler.net/problem=25</a>
 */
public class Problem025 extends AbstractProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "4782";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		BigInteger previous = BigInteger.ZERO;
		BigInteger current = BigInteger.ONE;
		// start from 1 since current: Fib(1) = 1
		int index = 1;

		while (current.toString().length() < 1_000) {
			BigInteger temp = current;
			current = previous.add(current);
			previous = temp;

			index++;
		}

		return Long.toString(index);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}