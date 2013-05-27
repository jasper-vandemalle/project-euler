/**
 * 
 */
package be.vandemalle.jasper.project.euler;

/**
 * Solution to Project Euler problem 2.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=2">http://projecteuler.net/problem=2</a>
 * 
 */
public class Problem002 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		int sumOfEvenFibonacciTerms = 0;
		int previousFibonacciTerm = 1;
		int currentFibonacciTerm = 2;

		while (currentFibonacciTerm < 4000000) {
			if (currentFibonacciTerm % 2 == 0) {
				sumOfEvenFibonacciTerms += currentFibonacciTerm;
			}

			int temp = currentFibonacciTerm;
			currentFibonacciTerm += previousFibonacciTerm;
			previousFibonacciTerm = temp;
		}

		return Integer.toString(sumOfEvenFibonacciTerms);
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem002().solve());
	}
}