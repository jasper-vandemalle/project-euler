/**
 * 
 */
package be.vandemalle.jasper.project.euler;

import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

/**
 * Solution to Project Euler problem 5
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=5">http://projecteuler.net/problem=5</a>
 * 
 */
public class Problem5 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		int solution = 1;
		int[] primes = PrimeUtils.sieveOfAtkin(20);

		for (int prime : primes) {
			int highestPower = 1;
			int primeDivisorWithHighestPowerUnderTwenty = 0;
			int primeDivisorWithHighestPower = 0;

			do {
				primeDivisorWithHighestPowerUnderTwenty = primeDivisorWithHighestPower;
				primeDivisorWithHighestPower = (int) Math.pow(prime, highestPower++);
			} while (primeDivisorWithHighestPower < 20);

			solution *= primeDivisorWithHighestPowerUnderTwenty;
		}

		return Integer.toString(solution);
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem5().solve());
	}
}