package be.vandemalle.jasper.project.euler;

import java.math.BigInteger;

import be.vandemalle.jasper.project.euler.utils.MathUtils;

/**
 * Solution to Project Euler problem 16.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=16">http://projecteuler.net/problem=16</a>
 * 
 */
public class Problem016 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		// max long = (2^63)-1
		String numStr = BigInteger.valueOf(2).pow(1000).toString();
		return Integer.toString(MathUtils.countSumOfDigits(numStr));
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem016().solve());
	}
}