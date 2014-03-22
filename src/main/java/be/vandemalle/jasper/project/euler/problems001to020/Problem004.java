package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;
import be.vandemalle.jasper.project.euler.utils.TextUtils;

/**
 * Solution to Project Euler problem 4.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=4">http://projecteuler.net/problem=4</a>
 */
public class Problem004 extends AbstractProblemTester {
    /**
     * The Constant ANSWER.
     */
    private static final String ANSWER = "906609";

    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        int maxPalindrome = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int product = i * j;

                if (TextUtils.isPalindrome(product) && maxPalindrome < product) {
                    maxPalindrome = product;
                }
            }
        }

        return Integer.toString(maxPalindrome);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAnswer() {
        return ANSWER;
    }
}
