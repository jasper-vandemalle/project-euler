package be.vandemalle.jasper.project.euler;

import java.util.List;

import be.vandemalle.jasper.project.euler.utils.PrimeUtils;

/**
 * Solution to Project Euler problem 3.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=3">http://projecteuler.net/problem=3</a>
 * 
 */
public class Problem003 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		Long number = 600_851_475_143L;
		List<Integer> primes = PrimeUtils.sieveOfAtkinAsList(30_000);

		while (!primes.contains(number.intValue())) {
			for (Integer prime : primes) {
				if (number % prime == 0) {
					number = number / prime;
					break;
				}
			}
		}

		return Long.toString(number);
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem003().solve());
	}
}