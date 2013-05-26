/**
 * 
 */
package be.vandemalle.jasper.project.euler;

import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

/**
 * Solution to Project Euler problem 7.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=7">http://projecteuler.net/problem=7</a>
 * 
 */
public class Problem7 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		int[] primes = PrimeUtils.sieveOfAtkin((int) Math.pow(2, 17));
		return Integer.toString(primes[10_001 - 1]);
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem7().solve());
	}
}