package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;

/**
 * Solution to Project Euler problem 28.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=28">http://projecteuler.net/problem=28</a>
 */
public class Problem028 extends AbstractProblemTester {
    /**
     * The Constant ANSWER.
     */
    private static final String ANSWER = "669171001";

    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        // 1 is in the center
        int sumOfDiagonals = 1;

        /**
         * There's a pattern in here: 1; 3, 5, 7, 9; 13, 17, 21, 25; 31, 37, ...
         *
         * 1; (1 + 2), (3 + 2), (5 + 2), (7 + 2); (9 + 4), (13 + 4), (17 + 4), (21 + 4); (25 + 6), (31 + 6), ...
         */
        int diagonalValue = 1;
        for (int i = 1; i <= (1_001 - 1) / 2; i++) {
            for (int j = 1; j <= 4; j++) {
                diagonalValue += (i * 2);
                sumOfDiagonals += diagonalValue;
            }
        }

        return Integer.toString(sumOfDiagonals);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAnswer() {
        return ANSWER;
    }
}
