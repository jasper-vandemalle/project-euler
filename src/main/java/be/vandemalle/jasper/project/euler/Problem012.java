package be.vandemalle.jasper.project.euler;

/**
 * Solution to Project Euler problem 12.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=12">http://projecteuler.net/problem=12</a>
 * 
 */
public class Problem012 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		long triangNum = 0;
		for (int i = 1;; i++) {
			triangNum += i;

			// TODO: count divisors needs optimisation
			if (countDivisors(triangNum) > 500) {
				break;
			}
		}

		return Long.toString(triangNum);
	}

	/**
	 * Count the divisor for a certain number.
	 * 
	 * @param n the number
	 * @return the amount of divisors
	 */
	private static int countDivisors(long n) {
		int count = 0;
		int end = (int) Math.sqrt(n);
		for (int i = 1; i < end; i++) {
			if (n % i == 0) {
				count += 2;
			}
		}
		if (end * end == n) {
			// Perfect square, add another divisor
			count++;
		}
		return count;
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem012().solve());
	}
}