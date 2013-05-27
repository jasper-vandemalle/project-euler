package be.vandemalle.jasper.project.euler;

/**
 * Solution to Project Euler problem 4.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=4">http://projecteuler.net/problem=4</a>
 * 
 */
public class Problem004 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		int maxPalindrome = 0;

		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				int product = i * j;

				if (isPalindrome(product) && maxPalindrome < product) {
					maxPalindrome = product;
				}
			}
		}

		return Integer.toString(maxPalindrome);
	}

	/**
	 * Test if a certain number is a palindrome.
	 * 
	 * @param i the number to test
	 * @return <code>true</code> if the number is a palindrome, <code>false</code> otherwise
	 */
	public static boolean isPalindrome(int i) {
		String s = Integer.toString(i);
		StringBuilder sb = new StringBuilder(s);
		return s.equals(sb.reverse().toString());
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem004().solve());
	}
}