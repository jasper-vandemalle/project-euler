package be.vandemalle.jasper.project.euler.problems041to060;

import java.math.BigInteger;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;

/**
 * Solution to Project Euler problem 48.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=48">http://projecteuler.net/problem=48</a>
 */
public class Problem048 extends AbstractProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "9110846700";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		BigInteger sumOfSelfPowers = BigInteger.ZERO;

		for (int i = 1; i <= 1_000; i++) {
			BigInteger selfPower = BigInteger.valueOf(i).pow(i);
			sumOfSelfPowers = sumOfSelfPowers.add(selfPower);
		}

		String sumOfSelfPowersStringValue = sumOfSelfPowers.toString();
		return sumOfSelfPowersStringValue.substring(sumOfSelfPowersStringValue.length() - 10);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}