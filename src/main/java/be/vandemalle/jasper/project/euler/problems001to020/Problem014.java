package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;

/**
 * Longest Collatz sequence.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=14">Project Euler problem 14</a>
 */
public class Problem014 implements Solvable {
    private static final int LIMIT = 1_000_000;

    @Override
    public String solve() {
        // chain lengths for starting numbers below the limit, filled in as they are computed
        int[] cache = new int[LIMIT];
        cache[1] = 1;
        int longestStart = 1;

        for (int start = 2; start < LIMIT; start++) {
            if (chainLength(start, cache) > cache[longestStart]) {
                longestStart = start;
            }
        }

        return Integer.toString(longestStart);
    }

    private static int chainLength(long n, int[] cache) {
        if (n < cache.length && cache[(int) n] != 0) {
            return cache[(int) n];
        }

        // terms can climb well above the limit, hence the long
        int length = 1 + chainLength(n % 2 == 0 ? n / 2 : 3 * n + 1, cache);

        if (n < cache.length) {
            cache[(int) n] = length;
        }
        return length;
    }
}
