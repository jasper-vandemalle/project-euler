package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.TextUtils;

/**
 * Double-base palindromes.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=36">Project Euler problem 36</a>
 */
public class Problem036 implements Solvable {
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
