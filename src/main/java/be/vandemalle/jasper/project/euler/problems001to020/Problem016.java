package be.vandemalle.jasper.project.euler.problems001to020;

import java.math.BigInteger;

import be.vandemalle.jasper.project.euler.ProblemTester;
import be.vandemalle.jasper.project.euler.utils.MathUtils;

/**
 * Solution to Project Euler problem 16.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=16">http://projecteuler.net/problem=16</a>
 */
public class Problem016 extends ProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "1366";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		// max long = (2^63)-1
		String numStr = BigInteger.valueOf(2).pow(1_000).toString();
		return Integer.toString(MathUtils.countSumOfDigits(numStr));
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}