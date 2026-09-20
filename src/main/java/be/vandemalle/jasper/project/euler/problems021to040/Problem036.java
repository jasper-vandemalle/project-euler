package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.TextUtils;

/**
 * Solution to Project Euler problem 36.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=36">http://projecteuler.net/problem=36</a>
 */
public class Problem036 implements Solvable {
    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        int sumOfDoubleBasePalindromes = 0;

        for (int i = 1; i < 1_000_000; i++) {
            String binary = Integer.toBinaryString(i);

            boolean baseTenPalindrome = TextUtils.isPalindrome(i);
            boolean baseTwoPalindrome = TextUtils.isPalindrome(binary);

            if (baseTenPalindrome && baseTwoPalindrome) {
                sumOfDoubleBasePalindromes += i;
            }
        }
        return Integer.toString(sumOfDoubleBasePalindromes);
    }
}
