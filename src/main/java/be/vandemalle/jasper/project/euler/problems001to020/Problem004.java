package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.TextUtils;

/**
 * Largest palindrome product.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=4">Project Euler problem 4</a>
 */
public class Problem004 implements Solvable {
    @Override
    public String solve() {
        int maxPalindrome = 0;

        for (int i = 100; i <= 999; i++) {
            // multiplication is commutative, so j only needs to start at i
            for (int j = i; j <= 999; j++) {
                int product = i * j;

                if (product > maxPalindrome && TextUtils.isPalindrome(product)) {
                    maxPalindrome = product;
                }
            }
        }

        return Integer.toString(maxPalindrome);
    }
}
