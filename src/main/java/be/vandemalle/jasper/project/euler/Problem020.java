package be.vandemalle.jasper.project.euler;

import java.math.BigInteger;

import be.vandemalle.jasper.project.euler.utils.MathUtils;

import com.google.common.math.BigIntegerMath;

/**
 * Solution to Project Euler problem 20.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=20">http://projecteuler.net/problem=20</a>
 */
public class Problem020 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		BigInteger factorialOfHundred = BigIntegerMath.factorial(100);
		int sumOfDigits = MathUtils.countSumOfDigits(factorialOfHundred.toString());
		return Integer.toString(sumOfDigits);
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem020().solve());
	}
}