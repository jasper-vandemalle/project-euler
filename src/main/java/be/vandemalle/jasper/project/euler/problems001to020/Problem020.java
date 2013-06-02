package be.vandemalle.jasper.project.euler.problems001to020;

import java.math.BigInteger;

import be.vandemalle.jasper.project.euler.ProblemTester;
import be.vandemalle.jasper.project.euler.utils.MathUtils;

import com.google.common.math.BigIntegerMath;

/**
 * Solution to Project Euler problem 20.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=20">http://projecteuler.net/problem=20</a>
 */
public class Problem020 extends ProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "648";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		BigInteger factorialOfHundred = BigIntegerMath.factorial(100);
		int sumOfDigits = MathUtils.countSumOfDigits(factorialOfHundred.toString());
		return Integer.toString(sumOfDigits);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}