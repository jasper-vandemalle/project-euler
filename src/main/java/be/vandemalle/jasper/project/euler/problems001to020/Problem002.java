package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;

/**
 * Solution to Project Euler problem 2.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=2">http://projecteuler.net/problem=2</a>
 */
public class Problem002 extends AbstractProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "4613732";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		int sumOfEvenFibonacciTerms = 0;
		int previousFibonacciTerm = 1;
		int currentFibonacciTerm = 2;

		while (currentFibonacciTerm < 4_000_000) {
			if (currentFibonacciTerm % 2 == 0) {
				sumOfEvenFibonacciTerms += currentFibonacciTerm;
			}

			int temp = currentFibonacciTerm;
			currentFibonacciTerm += previousFibonacciTerm;
			previousFibonacciTerm = temp;
		}

		return Integer.toString(sumOfEvenFibonacciTerms);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}
