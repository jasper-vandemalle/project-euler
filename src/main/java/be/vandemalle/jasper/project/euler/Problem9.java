/**
 * 
 */
package be.vandemalle.jasper.project.euler;

/**
 * Solution to Project Euler problem 9.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=9">http://projecteuler.net/problem=9</a>
 * 
 */
public class Problem9 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		boolean foundTriplet = false;
		int a = 0, b = 0, c = 0;

		for (a = 1; a < 1000; a++) {
			int aSquare = (int) Math.pow(a, 2);

			for (b = a + 1; b < 1000; b++) {
				c = 1000 - a - b;
				int bSquare = (int) Math.pow(b, 2);
				int cSquare = (int) Math.pow(c, 2);

				// b is always > a
				if (c > b && aSquare + bSquare == cSquare) {
					foundTriplet = true;
					break;
				}
			}

			if (foundTriplet) {
				break;
			}
		}

		return Integer.toString(a * b * c);
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem9().solve());
	}
}