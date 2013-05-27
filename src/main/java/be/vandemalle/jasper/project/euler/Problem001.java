/**
 * 
 */
package be.vandemalle.jasper.project.euler;

/**
 * Solution to Project Euler problem 1.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=1">http://projecteuler.net/problem=1</a>
 * 
 */
public class Problem001 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		int sumOfMultiples = 0;

		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sumOfMultiples += i;
			}
		}

		return Integer.toString(sumOfMultiples);
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem001().solve());
	}
}