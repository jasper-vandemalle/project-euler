package be.vandemalle.jasper.project.euler;

/**
 * Solution to Project Euler problem 6.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=6">http://projecteuler.net/problem=6</a>
 * 
 */
public class Problem006 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		int sumOfSquares = 0;
		int squareOfSum = 0;

		for (int i = 1; i <= 100; i++) {
			squareOfSum += i;
			sumOfSquares += (int) Math.pow(i, 2);
		}

		squareOfSum = (int) Math.pow(squareOfSum, 2);

		return Integer.toString(squareOfSum - sumOfSquares);
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem006().solve());
	}
}