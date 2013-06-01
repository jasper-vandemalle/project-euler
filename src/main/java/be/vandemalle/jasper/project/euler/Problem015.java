package be.vandemalle.jasper.project.euler;

import java.math.BigInteger;

import be.vandemalle.jasper.project.euler.utils.MathUtils;

/**
 * Solution to Project Euler problem 15.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=15">http://projecteuler.net/problem=15</a>
 * 
 */
public class Problem015 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		BigInteger result = MathUtils.binomialCoefficient(40, 20);
		return result.toString();
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem015().solve());
	}
}