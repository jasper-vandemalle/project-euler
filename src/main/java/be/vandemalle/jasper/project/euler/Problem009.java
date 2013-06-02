package be.vandemalle.jasper.project.euler;

/**
 * Solution to Project Euler problem 9.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=9">http://projecteuler.net/problem=9</a>
 */
public class Problem009 extends ProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "31875000";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		boolean foundTriplet = false;
		int a = 0, b = 0, c = 0;

		for (a = 1; a < 1_000; a++) {
			int aSquare = (int) Math.pow(a, 2);

			for (b = a + 1; b < 1_000; b++) {
				c = 1_000 - a - b;
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

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}